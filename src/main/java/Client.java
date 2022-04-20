import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 8080;

        try (Socket clintSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clintSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clintSocket.getInputStream()))) {

            out.println("Netology");
            String resp = in.readLine();
            System.out.println(resp);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
