import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
    String reverse(String ch) throws RemoteException;
    char minChar(String ch) throws RemoteException;
    String caseChanger(String ch) throws RemoteException;
}
