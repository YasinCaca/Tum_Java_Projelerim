package Calisan_maas_ileri;

class calisan {
double asgari = 26005;
}

class muhendis extends calisan{
double katsayi = 1.3;
double maas;
muhendis (){}
double maashesap(){return asgari*katsayi;}}

class yonetici extends calisan{
    double katsayi = 1.6;
    double maas;
    yonetici (double y1){this.maas = y1;}
    double maashesap(){return maas*katsayi;}
}

public class Calisan_maas {
    public static void main(String[] args) {
        
        yonetici y1 = new yonetici(26005);
        muhendis m1 = new muhendis();
        
        System.out.println(m1.maashesap());
        System.out.println(y1.maashesap());
        
    }
}
