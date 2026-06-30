package Kendi_denemelerim;
import java.util.ArrayList;

class kitap{
    static ArrayList<kitap>kitaplar = new ArrayList<>();
    String kitad; String yazar; int sayfa;
    kitap (String k, String y, int s){this.kitad = k;this.yazar=y;this.sayfa=s;}
    void addBook(kitap ki){
         kitaplar.add(ki);
    
}}
public class Arraylı_kütüphane {
    public static void main(String[] args) {
        kitap k1= new kitap("abs ve caca aski"," abs  ", 250);
        kitap k2= new kitap("bilge ve talha aski"," bilge  ", 450);
        k1.addBook(k1);
        k2.addBook(k2);
        System.out.println("Kitap 1=  "+ kitap.kitaplar.get(0));
        System.out.println("Kitap 2=  "+ kitap.kitaplar.get(1).kitad);
    }
    
}
