package hafta13;
import java.io.*;
import java.net.*;

public class Client {
     public static void main(String[] args) throws Exception {

        Socket client = new Socket("localhost", 6000);
        DataOutputStream out =
                new DataOutputStream(client.getOutputStream());
        out.writeUTF("Merhaba Sunucu!");
        DataInputStream in =
                new DataInputStream(client.getInputStream());
        System.out.println("Sunucu diyor ki: " + in.readUTF());

        client.close();
    }
}
