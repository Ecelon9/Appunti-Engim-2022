package lezione2;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        
        //Chiedere tre numeri e restituire la media dei tre

        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());

        double media = (a + b + c) / 3;

        System.out.println("La media è: " + media);

        input.close();

    }
}