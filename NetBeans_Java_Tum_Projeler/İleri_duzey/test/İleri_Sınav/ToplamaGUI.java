/*
  Soru 14_2  -->  bir Java Swing uygulaması yapcanız.
  2 tane JTextField (sayı girişi için)
  1 tane Jbutton (hesapla)
  1 tane JLabel (sonucu göstermek için)
özellikler;
  kullanıcı iki metin alanına tam sayı değerler girer
  hesapla butonuna basanda bu iki sayıın toplamı hesaplanar.
  sonuç, etiket üzerinde "TOPLAM = x" biçiminde gösterilir
 Girişler sayı deelse kullanıcıya uygun bir hata mesajı gönderilir
*/


package İleri_Sınav;
import javax.swing.*;
import java.awt.*;



public class ToplamaGUI {
    public static void main(String []args){
        SwingUtilities.invokeLater(()-> {
            new ToplamaGUI().createGUI();});
        }
private void createGUI(){
JFrame frame = new JFrame("Toplama Uygulaması");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(350,180);

JTextField field1 = new JTextField(8);
JTextField field2 = new JTextField(8);
JButton button = new JButton("Hesapla");
JLabel label = new JLabel("Sonuc: ");

button.addActionListener(e -> {
    try{
        int sayi1 = Integer.parseInt(field1.getText());
        int sayi2 = Integer.parseInt(field2.getText());
        int toplam = sayi1+sayi2;
        label.setText("Toplam = " + toplam);}
    catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(frame,"Lutfen adam gibi tam sayi gir", "Hata",JOptionPane.ERROR_MESSAGE);}
    });

    JPanel panel = new JPanel();
    panel.add(new JLabel("Sayi1: "));
    panel.add(field1);
    panel.add(new JLabel("Sayi2: "));
    panel.add(field2);
    panel.add(button);
    panel.add(label);
    
    frame.add(panel);
    frame.setVisible(true);
}}



    
// toplama yapan swing uygulaması yapanzi
