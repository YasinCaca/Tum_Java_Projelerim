package Kendi_denemelerim;

abstract class sekil {abstract double alan(); }

class daire extends sekil{
double yaricap; daire(double y){this.yaricap = y;}
@Override
double alan(){return 3.14*yaricap;}}

class dikdortgen extends sekil{double kenar1; double kenar2;
dikdortgen(double k1, double k2){this.kenar1 = k1; this.kenar2 = k2;}
@Override
double alan(){return kenar1*kenar2;}}

class kare extends sekil{double kenar; kare(double k){this.kenar = k;}
@Override
double alan(){return kenar*kenar;}}

class ucgen extends sekil{
double taban; double yukseklik;
ucgen (double t, double y){ this.taban = t; this.yukseklik = y;}
@Override
double alan(){return taban*yukseklik ;}
}


public class Sekil_Hesaplama {
    public static void main(String[] args) {
        daire d1 = new daire(3);
        dikdortgen di1 = new dikdortgen(3,4);
        kare k1 = new kare(5);
        ucgen u1 = new ucgen(4,5);
        
        System.out.println(d1.alan());
        System.out.println(di1.alan());
        System.out.println(k1.alan());
        System.out.println(u1.alan());
        
    }
}
