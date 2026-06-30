package nesneye_yonelik;


public class NYP_2 {

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
        o2.iadeet(k2);   //aynı komutları test classında da yazdım
    }
    
}



/*
Bir kütüphane otomasyonu için Kitap, Öğrenci ve Test sınıfı hazırlayın.

Kitap sınıfında Adı, Yazarı, Sayfa Sayısı, Ödünç alınıp alınmadığı bilgileri tutulsun. 
Davranış olarak ise, ödünçAlındı ve iadeEdildi fonksiyonlarına sahip olsun. Bu fonksiyonlar ekrana bilgi yazabilir. (Kitap bir başka öğrenci tarafından ödünç alındıysa ve iade edilmediyse bilgi vermeli.)
Kullanıcı sınıfında ise, Öğrenci numarası, ad, soyad, yaş bilgileri tutulsun.
Davranış olarak, kitap ödünç alma ve iade etme fonksiyonları bulunsun.

Test sınıfında kitap ve öğrenci nesnelerini oluşturarak sistem simüle edilebilir.
*/