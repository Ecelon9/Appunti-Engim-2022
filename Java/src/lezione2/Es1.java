import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        
        //Chiedere tre numeri e restituire la media dei tre

        Scanner input = new Scanner(System.in);

        /*
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());

        double media = (a + b + c) / 3;

        System.out.println("La media è: " + media);
        */

        // chiedere la temperatura in farenheit e trasformarla in celsius

        System.out.println("Inserisci gradi farenheit:");

        double farenheit = Double.parseDouble(input.nextLine());

        double conversioneCels = 5 * (farenheit - 32) / 9;

        double celsius = Math.round(conversioneCels * 100) / 100.0;

        System.out.println("equivalgono a: " + celsius + "°C.");


        input.close();

    }
}