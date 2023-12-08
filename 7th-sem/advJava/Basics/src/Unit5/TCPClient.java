package Unit5;
/*
*  Here socket is known as client and it makes request to server using input output
* */

import java.io.*;
import java.net.*;
public class TCPClient {
    // create client reference
    private Socket socket = null;

    // to take input from console as a file
    private DataInputStream input = null;

    // to send data
    private DataOutputStream output = null;

    public TCPClient (String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Client connected.");
            System.out.println("Enter anything you want to send.");
            System.out.println("Press out to end.");

            input = new DataInputStream(System.in);
            output = new DataOutputStream(socket.getOutputStream());

        } catch (UnknownHostException uhe) {
            System.out.println(uhe);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        try {
            String str = "";
            while (!str.equals("out")) {
                // read input from console
                str = input.readLine();
                output.writeUTF(str);
                output.flush();
            }
            input.close();
            output.close();
            socket.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public static void main(String[] args) {
        TCPClient tcp = new TCPClient("localhost", 6969);
    }
}
