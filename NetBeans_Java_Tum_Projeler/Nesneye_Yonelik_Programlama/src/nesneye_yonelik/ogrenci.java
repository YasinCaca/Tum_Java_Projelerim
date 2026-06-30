package nesneye_yonelik;

public class ogrenci {
    int ogrencino;
    String ad;
    String soyad;
    int yas;

    public ogrenci(int no, String ad, String soy, int yas) {
        this.ogrencino = no;
        this.ad = ad;
        this.soyad = soy;
        this.yas = yas;
    }

    public void oduncal(kitap kitos) {
        kitos.oduncalindi();
    }

    public void iadeet(kitap kitap) {
        kitap.iade();
    }

    @Override
    public String toString() {
        return "Ogrenci No: " + ogrencino + ", Ad: " + ad + " " + soyad + ", Yas: " + yas;
    }
}
