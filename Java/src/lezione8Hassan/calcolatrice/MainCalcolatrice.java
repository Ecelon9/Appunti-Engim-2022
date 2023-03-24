package calcolatrice;
import java.util.Scanner;

public class MainCalcolatrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continua = true;

        System.out.println("Calcolatrice: ");

        while (continua) {
            Calcolatrice calc = new Calcolatrice();

            System.out.println("Vuoi eseguire un'altro calcolo? si  no");
            String scelta = input.next();
            if(scelta.contains("si")) {
                calc = null;

            } else {
                continua = false;

            }
        }
        input.close();

    }
}
