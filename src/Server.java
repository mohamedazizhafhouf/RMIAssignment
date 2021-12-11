import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);

        System.out.println("Server is connected");
    }

    @Override
    public String reverse(String ch) {
        String chf ="";
        for (int i=0;i<ch.length();i++){
           chf=ch.charAt(i)+chf;
        }
        return chf;
    }

    @Override
    public char minChar(String ch) {
        char min='z';
        for (int i=0;i<ch.length();i++){
            if (ch.charAt(i)<min){
                min=ch.charAt(i);
            }
        }
        return min;

    }

    @Override
    public String caseChanger(String ch) {
        String chf ="";
        for (int i=0;i<ch.length();i++){
            char c = ch.charAt(i);
            if (Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }
            else {
                c = Character.toUpperCase(c);
            }
            chf=chf+c;
        }
        return chf;
    }
}
