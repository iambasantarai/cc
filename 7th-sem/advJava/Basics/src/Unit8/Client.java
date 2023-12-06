package Unit8;
import java.rmi.*;
import java.rmi.registry.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try {
            // connect to server using RMI registry
            Registry r = LocateRegistry.getRegistry(6969);
            // look for server and extract remote object
            RemoteService rs = (RemoteService) r.lookup("Server69");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number you want to find odd and prime: ");
            int num1 = sc.nextInt();
            System.out.println(rs.findOdd(num1));
            System.out.println(rs.findPrime(num1));

        }catch (RemoteException | NotBoundException e) {
            System.out.println(e);
        }
    }
}
