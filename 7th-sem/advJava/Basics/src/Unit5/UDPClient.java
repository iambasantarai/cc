package Unit5;
/* Here client is also refer as DatagramSocket
* Client make request to server until it presses out
*/

import java.net.*;
import java.util.*;
public class UDPClient {
    public static void main(String[] args) {
        try {
           // create client socket
            DatagramSocket dcc = new DatagramSocket();

            // extract own ip address
            InetAddress ip = InetAddress.getLocalHost();
            // to store packet in form of byte
            byte buff [] = null;
            Scanner sc = new Scanner(System.in);

            // accept input till out is type
            System.out.println("Enter any thing you want to send: ");
            System.out.println("Enter out to end.");

            while (true) {
                String str = sc.nextLine();
                buff = str.getBytes();

                // create packet for sending data
                DatagramPacket pkt = new DatagramPacket(buff, buff.length, ip, 6969);

                // send data using send()
                dcc.send(pkt);

                if (str.equals("out")) {
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
