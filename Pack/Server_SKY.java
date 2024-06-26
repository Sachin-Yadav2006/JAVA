
import java.io.*;
import java.net.*;
import java.util.Date;


public class Server_SKY {
     public static void main(String[] args) {
        if (args.length < 1) return;
 
        int port = Integer.parseInt(args[0]);
 
        try (ServerSocket serverSocket = new ServerSocket(port)) {
 
            System.out.println("Server is listening on port " + port);
            System.out.println("Connected Systems are : ");
            int a=1;
            while (true) {
                Socket socket = serverSocket.accept();
                InetAddress address=(InetAddress)socket.getInetAddress();
                System.out.println("User "+a+" :"+address);
                a=a+1;

 
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
 
                writer.println(new Date().toString());
            }
 
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

}
