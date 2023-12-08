package Unit5;

/*
* In TCP server is known as socket server  and client is known as socket.
* Here, message is transferred in form of input output
* */

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
import java.net.*;
public class TCPServer {
    // client
    private Socket socket = null;

    // server
    private ServerSocket server = null;

    // to take input
    private DataInputStream input = null;

    public TCPServer (int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started.");
            System.out.println("Waiting for client.");

            // create connection with client
            socket = server.accept();
            System.out.println("Client accepted.");

            // take input from client
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String answer = "";

            while(!answer.equals("out")) {
                answer = input.readUTF();
                System.out.println("Client says: " + answer);
                System.out.println("Reverse form of client data: ");
                String reverse = "";

                for (int i = 0; i < answer.length(); i++) {
                    reverse = answer.charAt(i) + reverse;
                }
                System.out.println(reverse);
            }

            // close server
            socket.close();
            input.close();

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public static void main(String[] args) {
        TCPServer tcp = new TCPServer(6969);
    }
}
