package nesneye_yonelik;

public class test {
     public static void main(String[] args) {
        kitap k1 = new kitap("Suc ve Ceza", "Fyodor Dostoyevski", 600);
        kitap k2 = new kitap("Simyacı", "Paulo Coelho", 180);
        ogrenci o1 = new ogrenci(101, "Ahmet", "Yılmaz", 20);
        ogrenci o2 = new ogrenci(102, "Ayse", "Demir", 22);

        System.out.println("=== Kutuphane Sistemi ===\n");

        o1.oduncal(k1);
        o2.oduncal(k1);
        o1.iadeet(k1);
        o1.iadeet(k1);
        o2.oduncal(k1);
        o2.oduncal(k2);
        o2.iadeet(k1);
        o2.iadeet(k2);
    }
}
