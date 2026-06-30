package OGRİS_OTOMASYON;

interface Kullanici {
    String adsoyad = "";
    String yas = "";
    void displayKullanici();
}

// Ders sınıfı
class Ders {
    private String dersKodu;
    private String dersAdi;

    public Ders(String dersKodu, String dersAdi) {
        this.dersKodu = dersKodu;
        this.dersAdi = dersAdi;
    }

    // Getter ve Setter
    public String getDersKodu() {
        return dersKodu;
    }

    public void setDersKodu(String dersKodu) {
        this.dersKodu = dersKodu;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    @Override
    public String toString() {
        return dersKodu + " - " + dersAdi;
    }
}

// Öğretmen sınıfı
class Ogretmen implements Kullanici {
    private String adSoyad;
    private String yas;
    private String unvan;
    private Ders[] verdigiDersler; // 3 derslik dizi

    public Ogretmen(String adSoyad, String yas, String unvan) {
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.unvan = unvan;
        this.verdigiDersler = new Ders[3]; // 3 derslik yer aç
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setVerdigiDersler(Ders[] dersler) {
        this.verdigiDersler = dersler;
    }

    public Ders[] getVerdigiDersler() {
        return verdigiDersler;
    }

    @Override
    public void displayKullanici() {
        System.out.println("Öğretmen: " + unvan + " " + adSoyad + " (" + yas + " yaşında)");
    }

    // Öğretmenin verdiği dersleri ve öğrencileri gösteren metod
    public void dersVeOgrencileriGoster(Ogrenci[] ogrenciler) {
        System.out.println("\n--- " + unvan + " " + adSoyad + " adlı öğretmenin dersleri ---");
        for (Ders d : verdigiDersler) {
            if (d != null) {
                System.out.println("Ders: " + d);
                System.out.println("Bu dersi alan öğrenciler:");
                boolean bulundu = false;
                for (Ogrenci o : ogrenciler) {
                    for (Ders od : o.getAldigiDersler()) {
                        if (od != null && od.getDersKodu().equals(d.getDersKodu())) {
                            System.out.println(" - " + o.getAdSoyad());
                            bulundu = true;
                        }
                    }
                }
                if (!bulundu) System.out.println("   (Bu dersi alan öğrenci yok)");
                System.out.println();
            }
        }
    }
}

// Öğrenci sınıfı
class Ogrenci implements Kullanici {
    private String adSoyad;
    private String yas;
    private Ders[] aldigiDersler; // 2 derslik dizi
    private int[] notlar; // her ders için bir not

    public Ogrenci(String adSoyad, String yas) {
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.aldigiDersler = new Ders[2];
        this.notlar = new int[2];
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public Ders[] getAldigiDersler() {
        return aldigiDersler;
    }

    public void setAldigiDers(int index, Ders ders, int not) {
        if (index >= 0 && index < 2) {
            this.aldigiDersler[index] = ders;
            this.notlar[index] = not;
        }
    }

    @Override
    public void displayKullanici() {
        System.out.println("Öğrenci: " + adSoyad + " (" + yas + " yaşında)");
    }

    // Öğrencinin ders ve notlarını gösteren metod
    public void dersVeNotGoster() {
        System.out.println("\n--- " + adSoyad + " adlı öğrencinin dersleri ve notları ---");
        for (int i = 0; i < aldigiDersler.length; i++) {
            if (aldigiDersler[i] != null) {
                System.out.println(aldigiDersler[i] + " | Not: " + notlar[i]);
            }
        }
    }
}

// Test sınıfı (main metodu burada)
public class Kapsamli_Ogris_Sistemi {
    public static void main(String[] args) {
        // Ders nesneleri
        Ders d1 = new Ders("MAT101", "Matematik");
        Ders d2 = new Ders("FZK102", "Fizik");
        Ders d3 = new Ders("BIO103", "Biyoloji");

        // Öğretmen nesnesi
        Ogretmen ogretmen1 = new Ogretmen("Ahmet Yılmaz", "40", "Prof. Dr.");
        ogretmen1.setVerdigiDersler(new Ders[]{d1, d2, d3});

        // Öğrenci nesneleri
        Ogrenci o1 = new Ogrenci("Ayşe Demir", "20");
        o1.setAldigiDers(0, d1, 85);
        o1.setAldigiDers(1, d2, 90);

        Ogrenci o2 = new Ogrenci("Mehmet Can", "21");
        o2.setAldigiDers(0, d2, 75);
        o2.setAldigiDers(1, d3, 88);

        // Kullanıcı bilgilerini göster
        ogretmen1.displayKullanici();
        o1.displayKullanici();
        o2.displayKullanici();

        // Öğrencilerin ders ve notlarını göster
        o1.dersVeNotGoster();
        o2.dersVeNotGoster();

        // Öğretmenin verdiği dersleri ve bu dersleri alan öğrencileri göster
        ogretmen1.dersVeOgrencileriGoster(new Ogrenci[]{o1, o2});
    }
}




/*

"Kullanıcı" isminde bir arayüzün olduğunu var sayalım. 
Bu arayüzün "adsoyad" ve "yaş" olmak üzere 2 tane string değişkeni ve "displaykullanici" isminde methodu olsun. 

Ders isminde bir sınıf oluştur. Bu sınıf içinde "derskodu" ve "dersadı" isminde 2 string değişken olsun. 
Bu 2 değişkene erişim için gerekli düzenlemeleri yapınız. 

Öğrenci ve öğretmen adında kullanıcı arayüzünü barındıran 2 farklı sınıf olacak. 
öğretmen sınıfında ünvan isminde değişken olacak. Bu değişkene erişim için gerekli düzenlemeleri yapınız. 
Öğretmen sınıfında ders sınıfına ait 3 nesne barındıran bir dizi oluşturun. 

Öğrenci sınıfında ise ders sınıfına ait 2 nesne barındıran dizi oluşturun. 
Ve derslerin sınav notunu içeren integer cinsinden değişkenler oluşturun. 
Bu değişkenlere ve derslere erişim için gerekli düzenlemeleri yapınız. 

Öğretmen sınıfındaki girilen öğretmenin derslerini ve içinde bulunan öğrencileri gösteren metodu yazınız
Öğrenciler sınıfındaki girilen öğrencinin derslerini ve notunu gösteren methodu yazınız.
*/