package Kendi_denemelerim;
import java.util.Hashtable;

class Person{String name;int id;}
class Student extends Person{
    Student(String nam,int idd){this.name = nam;this.id = idd;}
    public void ogrencigor(){System.out.println(name + ", " + id);}
    Hashtable<String,Integer>ogrenci = new Hashtable<>();
    public void addgrade(String course, int grade){ogrenci.put(course,grade);}
    public void printgrades(){for (String key : ogrenci.keySet()) {System.out.println(key + " --> " + ogrenci.get(key));}}
    public void getaverage(){double ort = 0;for (String k : ogrenci.keySet()) {ort = ort+ogrenci.get(k);}
                                                            ort = ort/ogrenci.size(); System.out.println("ortalamasi: " +ort);}
    public void deneme(){System.out.println(ogrenci.keySet());}
}
        

public class Ogrenci_ortalama {

    public static void main(String[] args) {
        Student s1 = new Student("yasin", 610056);
        s1.ogrencigor();
        s1.addgrade("mat", 56);
        s1.addgrade("fiz", 65);
        s1.addgrade("dif", 50);
        s1.printgrades();
        s1.getaverage();
        s1.deneme();
    }
}


/*
HashMap <String,String>telefon = new HashMap<>();
        telefon.put("544", "Yasin CACA");
        System.out.println(telefon.get("544"));
*/





/*  v1
1K= 1024 => 0 - 1023 => 0 - 03FF 
2K= 2048 => 0 - 2047 => 0 - 07FF
4K= 4096 => 0 - 4095 => 0 - 0FFF
8K= 8192 => 0 - 8191 => 0 - 1FFF
----------------------------------------
1K  0    - 1023  => 0000 - 03FF 
    0000 0000 0000 0000  - 0000 0011 1111 1111

2K  1024 - 3071  => 0400 - 0BFF  (3071 = 3072 -1 = 1024*3 -1 ) 
    0000 0100 0000 0000  - 0000 1011 1111 1111 

4K  3072 - 7167  => 0C00 - 1BFF 
    0000 1100 0000 0000  - 0001 01011 1111 1111 

8K  7168 - 15359 => 1C00 - 3BFF 
    0001 1100 0000 0000  - 0011 1011 1111 1111 

3BFF  = 15359 => 15359 + 1 = 15360 => 15360 / 1024 = 15K (1K + 2K + 4K + 8K) 
--------------------------------------
RAM1  0    - 2047  => 0000 - 07FF 
      0000 0000 0000 0000  - 0000 0111 1111 1111

RAM2   2048- 4095  => 0800 - 0FFF  (4095 = 4096 -1 = 1024*4 -1 = 2^12 -1) 
       0000 1000 0000 0000 - 0000 1111 1111 1111 

RAM3  4096- 6143  => 1000 - 17FF 
      0001 0000 0000 0000 - 0001 0111 1111 1111


RAM4  6144 - 8191 => 1800 - 1FFF 
      0001 1000 0000 0000 - 0001 1111 1111 1111
      
----------------------------------------------------------------------------
RAM1 (16K boyutunda ve 4000h adresinden başlarsa !!!)  
       4000h               - ????h
       16384               - 16384 + 16384 -1 = 32767
       4000h               - 7FFFh  
       0100 0000 0000 0000 - 0100 1111 1111 1111

RAM2 (4K boyutunda ve 5000h adresinden başlarsa !!!) 
       5000h               - ????h 
       4K= 4096 => 0FFF =>  5000h + 0FFFh = 5FFFh 
       5000h               - 5FFFh 
       0101 0000 0000 0000 - 0101 1111 1111 1111 

RAM3  (4K boyutunda ve 5000h adresinden başlarsa !!!)
      6000h                - ????h 
      4K= 4096 => 0FFF =>  6000h + 0FFFh = 6FFFh 
      6000h                - 6FFFh                 
      0110 0000 0000 0000  - 0110 1111 1111 1111


ROM   (4K boyutunda ve F000h adresinden başlarsa !!!)
      F000h - ????h 
     4K= 4096 => 0FFF =>  F000h + 0FFFh = FFFFh  
      F000h               - FFFFh 
      1111 0000 0000 0000 - 1111 1111 1111 1111 */


/*  v2
1K= 1024 => 0 - 1023 => 0 - 03FF = 1024 -1 = 100 0000 0000 - 1 
2K= 2048 => 0 - 2047 => 0 - 07FF           = 011 1111 1111 
4K= 4096 => 0 - 4095 => 0 - 0FFF
8K= 8192 => 0 - 8191 => 0 - 1FFF
----------------------------------------
1K  0    - 1023  => 0000 - 03FF 
    0000 0000 0000 0000 - 0000 0011 1111 1111

2K  1024 - 3071  => 0400 - 0BFF  (3071 = 3072 -1 = 1024*3 -1 ) 
    0000 0100 0000 0000 - 
4K  3072 - 7167  => 0C00 - 1BFF 
8K  7168 - 15359 => 1C00 - 3BFF 

--------------------------------------
RAM1  0    - 2047  => 0000 - 07FF 
      0000 0000 0000 0000 - 0000 0111 1111 1111

RAM2   2048- 4095  => 0800 - 0FFF  (4095 = 4096 -1 = 1024*4 -1 = 2^12 -1) 
       0000 1000 0000 0000 - 0000 1111 1111 1111 

RAM3  4096- 6143  => 1000 - 17FF 
      0001 0000 0000 0000 - 0001 0111 1111 1111


RAM4  6144 - 8191 => 1800 - 1FFF 
      0001 1000 0000 0000 - 0001 1111 1111 1111
      
--------------------------------------
RAM1   4000h               - ????h
       16384               - 16384+4096-1 = 20479 
       4000h               - 4FFFh  
       0100 0000 0000 0000 - 0100 1111 1111 1111

RAM2   5000h               - ????h 
       20480               - 20480 + 1024*4 -1 = 24575
       5000h               - 5FFFh 
       0101 0000 0000 0000 - 0101 1111 1111 1111 

RAM3  6000h                - ????h 
      24576                - 24576 + 1024*4 -1 = 28671
      6000h                - 6FFFh                 
      0110 0000 0000 0000  - 0110 1111 1111 1111


ROM   F000h - ????h 
      F000h               - FFFFh 
      1111 0000 0000 0000 - 1111 1111 1111 1111 

-------------------------------------------------------------------------------
2Kx8 EPROM  0000h - 07FFh --- 0000 0000 0000 0000
                              0000 0111 1111 1111
BOŞ                           
8Kx8 RAM1   2000h - 3FFFh --- 0010 0000 0000 0000
                              0011 1111 1111 1111

BOŞ 
2Kx8 RAM2   E000h - E7FFh --  1110 0000 0000 0000  
                              1110 1111 1111 1111

BOŞ 

-------------------------------------------------
SORU : 4Kx8  RAM ve 4Kx8  ROM kullanarak 12Kx8 RAM ve 4Kx8 ROM 
olıuşturunuz. RAM başlangıç adresi 4000h ROM başlan bŞLngıç adresi
F000h ise bellek organizasyonunu oluşturunuz. 


RAM 1  4000h               - 4FFFh  
       0100 0000 0000 0000 - 0100 1111 1111 1111 

RAM2  5000h               - 5FFFh 
      0101 0000 0000 0000 - 0101 1111 1111 1111 

RAM3  6000h                - 6FFFh                 
      0110 0000 0000 0000  - 0110 1111 1111 1111

ROM   F000h               - FFFFh 
      1111 0000 0000 0000 - 1111 1111 1111 1111 





RAM1        0100 0000 0000 0000  
            0100 1111 1111 1111 
            
RAM2        0101 0000 0000 0000  
            0101 1111 1111 1111
            
RAM3        0110 0000 0000 0000   
            0110 1111 1111 1111
		         
ROM         1111 0000 0000 0000 
            1111 1111 1111 1111 
			
			
			
			
			
RAM1        0000 0000 0000 0000  
            0000 1111 1111 1111 
            
RAM2        0001 0000 0000 0000  
            0001 1111 1111 1111
            
RAM3        0010 0000 0000 0000   
            0010 1111 1111 1111







-------------------------------------------------
1K= 1024 => 0 - 1023 => 0 - 03FF   
2K= 2048 => 0 - 2047 => 0 - 07FF            
4K= 4096 => 0 - 4095 => 0 - 0FFF
8K= 8192 => 0 - 8191 => 0 - 1FFF
-------------------------------------------------

2Kx8 EPROM - 8KX8 RAM1 - 2KX8 RAM2 
EPROM başlangıç adresi - 0000h 
RAM1  başlangıç adresi - 2000h
RAM2  başlangıç adresi - E000h 
3x8 MUX devresi kullanarak bellek  organizasyonu yapınız. 

EPROM               0000h - 07FFh
      0000 0000 0000 0000 - 0000 0111 1111 1111

RAM1                2000h - 3FFFh
      0010 0000 0000 0000 - 0011 1111 1111 1111
	  
RAM2                E000h - E7FFh
      1110 0000 0000 0000 - 1110 0111 1111 1111
	  
	  
	  0000 0000 0000 0000  
	  0000 0111 1111 1111
	  
	  0010 0000 0000 0000  
	  0011 1111 1111 1111
	  
	  1110 0000 0000 0000  
	  1110 0111 1111 1111
	  
	  BELLEK ORGANİZASYONU 
	  SAYI ARİTMETİĞİ 
	  TANIMLAR 1-2 SORU 
	  MATEMATİKSEL İFADELER */