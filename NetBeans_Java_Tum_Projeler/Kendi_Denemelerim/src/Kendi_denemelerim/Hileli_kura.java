package Kendi_denemelerim;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Hileli_kura {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String>kura = new ArrayList<>();
        
        System.out.println("Kurada Kac Kisi Olacak?");
        int sayi = Integer.parseInt(scan.nextLine());
        System.out.println("Kac Kisi Secilecek?");
        int sec = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= sayi; i++){
            System.out.println(i +". kisiyi gir"); 
            String a = scan.nextLine();
            kura.add(a);
        }
        ArrayList <String> secil = new ArrayList<>(kura.subList(0,sec));   //hile burada. önce başta kura dizisine tüm kişileri yazdırdık, sonra kurada ilk yazılan kişilerin seçilmesini sağladık.
        Collections.shuffle(secil);                     //burada da ilk yazılan kişilerin olduğu diziyi karıştırdık ki rastgele olmuş gibi görünsün.
        System.out.println("Kontejan bitti. Secilen kisiler sunlar;");
        for (int t = 0; t<sec; t++){System.out.println("Secilen "+(t+1)+". Kisi: " + kura.get(t));}
    }
}
