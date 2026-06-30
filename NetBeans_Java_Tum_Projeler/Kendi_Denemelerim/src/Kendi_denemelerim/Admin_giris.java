package Kendi_denemelerim;
import java.util.Hashtable;
import java.util.Scanner;



public class Admin_giris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hashtable <String, String>giris = new Hashtable<>();
        giris.put("admin", "ruhi123");
        System.out.println("Kullanici adi gir; ");
        String a = scan.nextLine();
        System.out.println("sifre gir; ");
        String b = scan.nextLine();
        if (giris.containsKey(a) == true){
            if(b.equals(giris.get(a))){System.out.println("giris basarili");}
              else{System.out.println("sifre yanlis");}}
        else{System.out.println("hesap yok");}
    }
}
