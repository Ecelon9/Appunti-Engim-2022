import java.util.Scanner;
public class EsMetodi {
    public static void main(String[] args) {
        System.out.println("Hai tirato un d6 ed è uscito: " + dado());


    }

    public static int dado() {
        int random = (int) Math.floor(Math.random() * 6);
        return random;

    }


}



