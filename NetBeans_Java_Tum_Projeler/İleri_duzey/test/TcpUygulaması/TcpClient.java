//İstemci Kodu (TcpClient.java)

package TcpUygulaması;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class TcpClient {
    public static void main(String[] args) {
      try {
         Socket socket = new Socket("localhost", 5000);
         
         BufferedReader userInput = new BufferedReader(
              new InputStreamReader(System.in) 
         );   
            BufferedReader in = new BufferedReader(
              new InputStreamReader(socket.getInputStream())
         );
            PrintWriter out = new PrintWriter(
              socket.getOutputStream(), true
         );
            
            System.out.print("Mesaj giriniz: ");
            String message = userInput.readLine();
            
            out.println(message);
            System.out.println("Sunucudan gelen cevap: " + in.readLine());
            
            socket.close();
            
         } catch (Exception e) {
            e.printStackTrace();
        }
     }
 }