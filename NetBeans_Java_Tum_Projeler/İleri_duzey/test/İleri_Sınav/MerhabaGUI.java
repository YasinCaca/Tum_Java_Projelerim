/*
  Soru 14_1  -->  bir Java Swing uygulaması yapcanız
  1 tane JTextField
  1 tane JButton
  1 tane JLabel
  kullanıcı metin alanına adını yazıp butona basanda, etiket üzerinde 
    "merhaba <isim>" şeklinde mesaj şekil şukul yapacaktır. Frame 175,175 koordinaatında 500x500 boyutunda olacak.
*/


package İleri_Sınav;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MerhabaGUI {
    public static void main(String []YARRAK){
        SwingUtilities.invokeLater(() -> {
            new MerhabaGUI().createGUI();
 });
 }
 private void createGUI() {
    JFrame frame = new JFrame("Java GUI Örneği");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(175,175,500, 500);
    JTextField textField = new JTextField(15);
    JButton button = new JButton("Göster");

    JLabel label = new JLabel("");
    button.addActionListener(e -> {
        String isim = textField.getText();
        label.setText("Merhaba " + isim);
 });    
    JPanel panel = new JPanel();
    panel.add(textField);
    panel.add(button);
    panel.add(label);
    frame.add(panel);
    frame.setVisible(true);
 }
}
