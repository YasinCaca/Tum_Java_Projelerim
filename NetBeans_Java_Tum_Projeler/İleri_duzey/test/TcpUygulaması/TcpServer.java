/*
  Soru 13_1  -->   TCP Tabanlı Basit İstemci–Sunucu Uygulaması (Tek İstemci)
  Java kullanarak TCP tabanlı bir istemci–sunucu uygulaması geliştiriniz.
   • Sunucu, istemciden gelen metin mesajını okusun.
   • Okunan mesajı büyük harfe çevirerek istemciye geri göndersin.
   • İletişim BufferedReader ve PrintWriter kullanılarak gerçekleştirilsin.

 */
//  Sunucu Kodu (TcpServer.java)
package TcpUygulaması;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
  public static void main(String[] args) {
    try {
       ServerSocket serverSocket = new ServerSocket(5000);
       System.out.println("Sunucu başlatıldı, istemci bekleniyor...");
       Socket clientSocket = serverSocket.accept();
       System.out.println("İstemci bağlandı.");
       BufferedReader in = new BufferedReader(
             new InputStreamReader(clientSocket.getInputStream())
        );
        PrintWriter out = new PrintWriter(
            clientSocket.getOutputStream(), true
        );
        String message = in.readLine();
        out.println(message.toUpperCase());
        
        clientSocket.close();
        serverSocket.close();
        
      } catch (Exception e) {
        e.printStackTrace();
    }
  }
}
