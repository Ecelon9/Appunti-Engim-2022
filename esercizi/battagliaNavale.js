
/*
BATTAGLIA NAVALE:

due giocatori
il campo è a due dimensioni (coordinate) che è il campo di battaglia
le navi sono solo di un quadretto 
si possono avere navi adiacenti
un turno di sparo per ogni giocatore

analizzare quiali informazioni sono utili per il gioco:
es: 
    - coordinate del posizionamento delle navi
    - coordinata di sparo effettuato
    - coordinata di nave colpita
    - coordinata di colpo a vuoto
    - altre...
	
le informazioni date sono sufficienti?
ci sono informazioni inutili?

come possiamo ipotizzare una struttura dati per memorizzare quello che ci serve?
*/

// Creare i giocatori:

let giocatore1 = {
    nome: "TU",
    colpiSparati: 0,
    punti: 0
};

let giocatore2 = {
    nome: "avversario",
    colpiSparati: 0,
    punti: 0
};

let casella = {
    x: 0,
    y: 0,
    piena: false,
    colpita: false
};

// Creare la tabella di gioco:


console.log("Per avviare la partita a Battaglia Navale, scrivi qui sotto: ");
console.log("avviaPartita(e qui inserisci il numero di caselle che vuoi sul tabellone) ");

function avviaPartita(numCaselle) {

    let partitaAvviata = true

    if (partitaAvviata == true) {
        console.log(giocatore1);
        console.log(giocatore2);

        //Genero la tabella di gioco

        let asseX = []
        let tabella = []

        for (let y = 0; y < numCaselle; y++) {
            for (let x = 0; x < numCaselle; x++) {
                asseX[x] = casella;

            }
            tabella[y] = asseX;

        }
        console.log(tabella)

        //Giocatore corrente?

        function turno() {

            let giocatori = [giocatore1, giocatore2]
            let giocatoreCorrente = false;

            if (giocatori == 0) {
                giocatoreCorrente = true
                console.log("è il tuo turno!")
            } else {
                console.log("Tocca all'avversario...")
            }
        }

        //funzione per sparare

        console.log("Inserisci le coordinate. Scrivi:");
        console.log("sparo(numero per X , numero per Y)")

        function sparo(x, y) {

            tabella.forEach(element => {
                if (x == tabella.x && y == tabella.y) {
                    if (tabella.piena == true) {
                        console.log("Colpita! Hai fatto un punto!")
                        tabella.colpita = true;
                        giocatore1.colpiSparati++;
                        giocatore1.punti++;

                    } else {
                        if (tabella.colpita == true) {
                            console.log("Ehi! Hai già sparato qui e non c'era niente se non l'acqua!")
                            giocatore1.colpiSparati++;

                        }
                        console.log("Acqua!")
                        tabella.colpita = true;
                        giocatore1.colpiSparati++;

                    }
                }
            });
        }
    }
}



