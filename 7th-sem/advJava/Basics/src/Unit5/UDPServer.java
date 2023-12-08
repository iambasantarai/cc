package Unit5;

import java.net.*;
public class UDPServer {
    public static void main(String[] args) {
        try {

            // create server socket with its port number
            DatagramSocket sc = new DatagramSocket(6969);

            // create byte array to accept packet
            byte [] rcv = new byte[6000];

            // create packet
            DatagramPacket pc = null;
            System.out.println("Server started. Waiting for client...");

            while (true) {
                // create packet with byte
                pc = new DatagramPacket(rcv, rcv.length);

                // receive data
                sc.receive(pc);

                // crv is sent as parameter to method data which will convert byte to string
                System.out.println("Client: " + data(rcv));

                // exit server if out is received
                if (data(rcv).toString().equals("out")) {
                    System.out.println("Client sent out so exiting server.");
                    break;
                }

                // clear buffer
                rcv = new byte[6000];
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static StringBuilder data(byte a[]) {
        if(a == null) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            int i = 0;

            while(a[i] != -1) {
                sb.append((char) a[i]);
                i ++;
            }
            return sb;
        }
    }
}
