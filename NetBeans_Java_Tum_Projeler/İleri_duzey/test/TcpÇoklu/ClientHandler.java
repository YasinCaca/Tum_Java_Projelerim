//İstemciyi Yöneten Thread (ClientHandler.java)
package TcpÇoklu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread {
    private Socket socket;
    
        public ClientHandler(Socket socket) {
          this.socket = socket;
        
        }
        @Override
        public void run() {
        try {
           BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream())
           );
            PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true
            );
            String message = in.readLine();
             System.out.println("İstemciden gelen mesaj: " + message);
             out.println("Mesaj alındı");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
