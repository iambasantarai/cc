package Unit8;

/*
* RMI stands for remote method invocation in which one object can invoke method of other object running in another JVM
* It is used for distributed system. It involves three part client, server, remove object (interface)
*
* stub: refers to the object that request service from server. It writes and request parameter to server object known as
*  marshalling. It is a gateway for client. It also accept needed parameter from server and transfer to client object known as
* unmarshalling.
*
* skeleton: refers to server object that sends the required parameter to stub known as marshaling. It also accept request (needed parameter)
* from stub known as unmarshaling.
*
* Step to create RMI program
* STEP 1: Create remote object (interface) that tell what service are provided
* STEP 2: Create server that will use remove object to provide service by registering RMI
* STEP 3: Create client that will use service provided by server object by requesting RMI object
* two exception are thrown: remove exception if remove object is not found
* NotBoundException if remove object is not bind with RMI registry
* */

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

// server class have to invoke remote object (interface) so UnicastRemoteObject have to be inherit
public class Server extends UnicastRemoteObject implements RemoteService{
    public Server() throws RemoteException {};

    @Override
    public String findOdd(int x) {
        if (x % 2 != 0) {
            return "Number is odd.";
        } else {
            return "Number is even.";
        }
    }

    @Override
    public String findPrime(int x) {
        int temp = 0;
        for (int i = 1; i <= x; i ++) {
            if (x % i == 0) {
                temp ++;
            }
        }
        if (temp == 2) {
            return "Number is prime number.";
        } else {
            return "Number is composite number.";
        }
    }

    public static void main(String[] args) {
        // register RMI server by using registry and setting port of server
        try {
            Registry r = LocateRegistry.createRegistry(6969);

            // bind object into registry
            r.rebind("Server69", new Server());
            System.out.println("Server is ready to provide service.");
        }catch (RemoteException re) {
            System.out.println(re);
        }
    }
}
