package nesneye_yonelik;

public class kitap {
    String kitad;
    String yazar;
    int sayfa;
    boolean odunc = false;  //intde olabilirdi

    public kitap(String adı, String yazarı, int sayfası) {
        this.kitad = adı;
        this.yazar = yazarı;
        this.sayfa = sayfası;
    }

    public void oduncalindi() {
        if (!odunc) {
            this.odunc = true;
            System.out.println("Kitap odunc alma islemi basarili");
        } else {
            System.out.println("Kitap zaten baskasi tarafindan alinmis");
        }
    }

    public void iade() {
        if (this.odunc) {
            this.odunc = false;
            System.out.println("Iade islemi basarili");
        } else {
            System.out.println("Kitap odunc alinmamis");
        }
    }}