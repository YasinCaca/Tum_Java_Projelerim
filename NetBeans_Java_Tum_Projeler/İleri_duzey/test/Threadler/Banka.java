/*
  Soru 12_1  -->  Thread Oluşturma ve Paylaşılan Kaynak Problemi
  Aşağıdaki senaryoda bir bankadaki ortak bir hesaptan para çekme işlemi gerçekleştirilmektedir. Aynı hesaba
  aynı anda birden fazla thread erişmektedir.
  İstenenler:
   1. Paylaşılan balance değişkeni için thread-safe bir yapı oluşturunuz.
   2. Runnable arayüzünü kullanarak thread’leri tanımlayınız.
   3. Senkronizasyon yapılmadığında oluşabilecek problemi kısaca açıklayınız
*/

package Threadler;

class BankAccount {
    private int balance = 1000;
    public synchronized void withdraw(int amount) {
    if (balance >= amount) {
      balance -= amount;
      System.out.println(Thread.currentThread().getName() +
          " para cekti. Kalan bakiye: " + balance);
  } else {
      System.out.println(Thread.currentThread().getName() +
          " icin bakiye yetersiz!");
    }
  }
}
class WithdrawTask implements Runnable {
    private BankAccount account;
    public WithdrawTask(BankAccount account) {
      this.account = account;
    }
@Override
public void run() {
    account.withdraw(700);
    }
}
public class Banka {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(new WithdrawTask(account), "Thread-1");
        Thread t2 = new Thread(new WithdrawTask(account), "Thread-2");
        t1.start();
        t2.start();
    }
}


/*
    Açıklama
    ▪ synchronized anahtar kelimesi, kritik bölgeyi (critical section) korur.
    ▪ Senkronizasyon yapılmazsa race condition oluşur ve iki thread aynı bakiyeyi aynı anda çekebilir.
    ▪ Runnable kullanımı, miras kısıtını (extends Thread) ortadan kaldırdığı için tercih edilir.
*/