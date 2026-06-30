/*
  Soru 12_2  -->  Java Multithreading – ExecutorService & Callable Soru-Cevap
  Bir üniversitenin öğrenci bilgi sisteminde, farklı öğrencilerin not ortalamaları eşzamanlı olarak hesaplanmak
  istenmektedir. Her öğrencinin ortalama hesaplama işlemi bağımsızdır ve sonuç olarak bir double değer
  döndürmektedir.
  İstenenler:
    1) ExecutorService kullanarak sabit boyutlu bir thread havuzu oluşturunuz.
    2) Callable arayüzünü kullanarak her öğrencinin not ortalamasını hesaplayan bir görev tanımlayınız.
    3) Future nesnesi ile hesaplanan sonuçları alıp ekrana yazdırınız.
*/


package Threadler;
import java.util.concurrent.*;

class GPAService implements Callable<Double> {
    private int[] grades;
    
    public GPAService(int[] grades) {
      this.grades = grades;
    }
    @Override
    public Double call() {
      int sum = 0;
     for (int g : grades) {
        sum += g;
    }
    return sum / (double) grades.length;
  }
}
public class UniOgris {
  public static void main(String[] args) throws Exception {
    ExecutorService executor = Executors.newFixedThreadPool(3);
    
    Callable<Double> student1 = new GPAService(new int[]{80, 75, 90});
    Callable<Double> student2 = new GPAService(new int[]{60, 70, 65});
    Callable<Double> student3 = new GPAService(new int[]{85, 95, 90});
    
    Future<Double> f1 = executor.submit(student1);
    Future<Double> f2 = executor.submit(student2);
    Future<Double> f3 = executor.submit(student3);
    
    System.out.println("Öğrenci 1 Ortalama: " + f1.get());
    System.out.println("Öğrenci 2 Ortalama: " + f2.get());
    System.out.println("Öğrenci 3 Ortalama: " + f3.get());
    
    executor.shutdown();
  }
}
