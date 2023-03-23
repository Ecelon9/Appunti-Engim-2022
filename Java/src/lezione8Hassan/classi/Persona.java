package classi;

public class Persona {

    private String nome;
    private String cognome;
    private Integer eta;

    //Costruttore vuoto
    public Persona() {
        
    }

    /**
     * 
     * @param nome
     * @param cognome
     * @param eta
     */
    public Persona(String nome, String cognome, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;

    }

    @Override
    public String toString() {
        return "Le caratteristiche dell'oggetto persona sono: \n" +
        "\t Nome: " + this.nome + "\n" +
        "\t Cognome: " + this.cognome + "\n" +
        "\t Eta: " + this.eta + "\n";
    }


    public static void main(String[] args) {

        Persona p = new Persona("Ciccio", "Graziani" , 40);
        System.out.println(p);
        

    }






    
    
}
