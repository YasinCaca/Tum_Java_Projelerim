package hafta13;
import java.io.*;      // InputStream, OutputStream, DataInputStream, DataOutputStream
import java.net.*;     // Socket, ServerSocket


public class GreetServer {
    public static void main(String[] args) throws Exception{
        int port = 6000;
        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {
            System.out.println("Waiting for client on port " + port + "...");

            Socket server = serverSocket.accept();
            System.out.println("Just connected to " 
                               + server.getRemoteSocketAddress());

            // istemciden gelen veriyi oku
            DataInputStream in =
                    new DataInputStream(server.getInputStream());
            System.out.println(in.readUTF());

            // istemciye yanıt gönder
            DataOutputStream out =
                    new DataOutputStream(server.getOutputStream());
            out.writeUTF("Thank you for connecting...");

            server.close();
        }
}}
