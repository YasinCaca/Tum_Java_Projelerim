package Asal_kontrol;
import java.util.Scanner;
import static Asal_kontrol.Asal_kontrol.AsalSayiKontrolu.asalMi;


public class Asal_kontrol {
    class AsalSayiKontrolu {
    // Asal sayı kontrolünü yapan metot
    static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false; // 1 ve negatif sayılar asal değildir
        }

        // 2'den sayının kareköküne kadar kontrol et
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false; // Tam bölünüyorsa asal değildir
            }
        }
        return true; // Hiçbir sayıya tam bölünmediyse asaldır
    }
    }
    
    
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        // Metodu kullanarak asal kontrolü
        if (asalMi(sayi)) {
            System.out.println(sayi + " bir asal sayidir.");
        } else {
            System.out.println(sayi + " bir asal sayi degildir.");
        }

        input.close();
    }
    
}
