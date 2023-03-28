import classes.*;

public class Game {

    private int maxScore;
    private int ships;
    private AssaultShip assShip;
    private Battleship batShip;
    private Carrier carrier;
    private Cruiser cruiser;
    private Player player1;
    private Player cpu;

     /**
     * Costruttore per nuova partita, con player senza punteggio registrato nel db
     * @param userName 
     */
    public Game(String userName) {
        this.maxScore = 5;
        this.ships = 5;
        this.assShip = new AssaultShip();
        this.batShip = new Battleship();
        this.carrier = new Carrier();
        this.cruiser = new Cruiser();
        this.player1 = new Player(userName);
        this.cpu = new Player(userName);

    }

    /**
     * Costruttore per nuova partita, con parametro nome giocatore e punteggio preso da db
     * @param userName 
     */
    public Game(String userName, int personalScore) {
        this.maxScore = 5;
        this.ships = 5;
        this.assShip = new AssaultShip();
        this.batShip = new Battleship();
        this.carrier = new Carrier();
        this.cruiser = new Cruiser();
        this.player1 = new Player(userName, personalScore);
        this.cpu = new Player("Computer");

    }

    /**
     * Metodo che piazza il tipo di nave scelta dal giocatore nelle coordinate X e Y cliccate sulla tabella lato front-end.
     * 
     * @param shipLength
     * @param x
     * @param y
     */
   



}