package Unit8;

// remote object
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteService extends Remote {
    String findOdd(int x) throws RemoteException;
    String findPrime(int x) throws RemoteException;
}
