
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


/*
creare un evento sul click del testo in basso allo splashscreen
per aprire la console.
https://developer.mozilla.org/en-US/docs/Web/API/Element/keydown_event
*/
//document.getElementByClassName("apriConsole").addEventListener("click", ActionCh);


// Creare i giocatori:

let giocatore1 = {
    nome: "TU",
    colpiSparati: 0,
    punti: 0,
    tabella: []
};

let giocatore2 = {
    nome: "avversario",
    colpiSparati: 0,
    punti: 0,
    tabella: []
};

let giocatori = [giocatore1, giocatore2];

let naviDisponibili = 0;
let naviAvversario = 0;



let partitaAvviata = false

// Creare la tabella di gioco:

console.log("Per avviare la partita a Battaglia Navale, scrivi qui sotto: ");
console.log("avviaPartita(e qui inserisci il numero di caselle che vuoi sul tabellone) ");

function avviaPartita(numCaselle) {

    partitaAvviata = true;

    if (partitaAvviata == true) {
        //Genero la tabella di gioco

        for (let i = 0; i < giocatori.length; i++) {
            for (let y = 0; y < numCaselle; y++) {
                giocatori[i].tabella[y] = new Array(numCaselle);

                for (let x = 0; x < numCaselle; x++) {
                    let casella = {
                        piena: false,
                        colpita: false
                    };

                    giocatori[i].tabella[y][x] = casella;
                }
            }
        }
        console.log(giocatore1);
        console.log("La tua tabella:");
        console.log(giocatore1.tabella);

        console.log("Ok! La griglia è pronta. Con quante navi vuoi giocare?");
        console.log("Scrivi: numeroNavi(il numero di quante navi vuoi).");
        console.log("Sappi che l'avversario, avrà la tua stessa quantità.");

    }
    return
}

//while (partitaAvviata == true) {      Attivare dopo aver inserito la condizione di vittoria

function numeroNavi(totale) {

    naviDisponibili = totale;
    naviAvversario = totale;

    console.log("Bene, adesso, piazza le navi! Una per volta, scrivi:")
    console.log("naveIn( numero della posizione in Y, numero della posizione in X )")
    console.log("Hai da schierare: " + naviDisponibili + " navi.")

}

function naveIn(x, y) {

    let navePiazzataBene = false;

    if (!giocatore1.tabella[x][y].piena == true) {
        if (naviDisponibili >= 2) {

            giocatore1.tabella[x][y].piena = true;
            naviDisponibili--;
            navePiazzataBene = true;
            console.log("Nave schierata!");
            console.log("Hai ancora: " + naviDisponibili + " da schierare.");

        } else if (naviDisponibili == 1) {
            giocatore1.tabella[x][y].piena = true;
            naviDisponibili--;
            navePiazzataBene = true;
            console.log("Tutte le navi schierate! è ora di sparare.");
            console.log("Inserisci le coordinate. Scrivi:");
            console.log("sparo(numero per X , numero per Y)");

        } else {
            console.log("Non hai più navi da schierare!");
            console.log("Inserisci le coordinate. Scrivi:");
            console.log("sparo(numero per X , numero per Y)");
        }
    } else {
        console.log("Non puoi mettere due navi nella stessa casella, riprova.");
    }

    if (navePiazzataBene == true) {
        navePiazzataBene = false;

        while (!navePiazzataBene) {
            var numeroRandom1 = Math.floor(Math.random() * giocatore2.tabella.length);
            var numeroRandom2 = Math.floor(Math.random() * giocatore2.tabella.length);
            console.log(numeroRandom1 + " " + numeroRandom2)

            if (naviAvversario != 0) {
                if (!giocatore2.tabella[numeroRandom1][numeroRandom2].piena == true) {
                    giocatore2.tabella[numeroRandom1][numeroRandom2].piena = true;
                    naviAvversario--;
                    navePiazzataBene = true;
                }
            } else {
                navePiazzataBene = true;
            }
        }
    }

}

//funzione per sparare

function sparo(y, x) {

    let navePiazzataBene = false;

        if (y == giocatore2.tabella[y] && x == giocatore2.tabella[y][x]) {
            if (giocatore2.tabella.piena == true) {
                console.log("Colpita! Hai fatto un punto!")
                giocaotore2.tabella.colpita = true;
                giocatore1.colpiSparati++;
                giocatore1.punti++;

            } else {
                if (giocatore2.tabella.colpita == true) {
                    console.log("Ehi! Hai già sparato qui e non c'era niente se non l'acqua!")
                    giocatore1.colpiSparati++;

                }
                console.log("Acqua!")
                giocatore2.tabella.colpita == true;
                giocatore1.colpiSparati++;

            }
        }
        

}

    //}

