/*
  Soru13_2  -->  Çoklu İstemci Destekleyen Thread Tabanlı Sunucu
        Birden fazla istemcinin aynı anda bağlanabildiği bir TCP sunucu uygulaması geliştiriniz.
        • Her istemci için ayrı bir thread oluşturulmalıdır.
        • Sunucu, istemciden gelen mesajı ekrana yazdırmalı ve “Mesaj alındı” cevabını göndermelidir.
*/

package TcpÇoklu;

import java.net.ServerSocket;
import java.net.Socket;

public class MultiClientServer {
    public static void main(String[] args) {
    try {
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Coklu istemci sunucusu baslatildi...");
        while (true) {
            Socket clientSocket = serverSocket.accept();
            new ClientHandler(clientSocket).start();
         }
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
}