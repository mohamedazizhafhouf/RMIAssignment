import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
           MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println("Input : ");
            Scanner sc = new Scanner(System.in);
            String ch = sc.nextLine();
            System.out.println("Reverse Output : "+service.reverse(ch));
            System.out.println("MinChar Output : "+service.minChar(ch));
            System.out.println("CaseChanger Output : "+service.caseChanger(ch));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
