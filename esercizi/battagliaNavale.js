
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

let punteggioMassimo = 0;
let naviDisponibili = 0;
let naviAvversario = 0;



let partitaAvviata = false;

// Creare la tabella di gioco:

console.log("                    Per avviare la partita a Battaglia Navale, scrivi qui sotto: ");
console.log("                   avviaPartita( numero della lunghezza delle righe del tabellone ) ");
console.log("                               per esempio, vuoi un 5x5? Scrivi 5");

function avviaPartita(numCaselle) {

    partitaAvviata = true;

    if (partitaAvviata == true) {
        //Genero la tabella di gioco
for (let i = 0; i < giocatori.length; i++) {                //ciclio i giocatori
            for (let y = 0; y < numCaselle; y++) {
                giocatori[i].tabella[y] = new Array(numCaselle);    //dichiaro un nuovo array, per giocatore

                for (let x = 0; x < numCaselle; x++) {
                    let casella = {                                 //dichiaro la casella
                        piena: false,
                        colpita: false
                    };

                    giocatori[i].tabella[y][x] = casella;           //la aggiungo nella tabella ad ogni cella
                }
            }
        }
        console.log(giocatore1);
        console.log("La tua tabella:");
        console.log(giocatore1.tabella);
        console.log("");
        console.log("Ok! La griglia è pronta. Con quante navi vuoi giocare?");
        console.log("Scrivi: numeroNavi(il numero di quante navi vuoi).");
        console.log("Sappi che l'avversario, avrà la tua stessa quantità.");
        console.log("Se vuoi sapere come sta andando, scrivi: info()");

    }
    return
}

function info() {

    console.log("Il tuo punteggio: " + giocatore1.punti + " Colpi sparati: " + giocatore1.colpiSparati);
    console.log("Il tuo avversario: " + giocatore2.punti + " Colpi sparati: " + giocatore2.colpiSparati);
    console.log("La tua tabella:");
    console.log(giocatore1.tabella);

}

// while (partitaAvviata == true) {     // non trovo la condizione giusta

    //condizione di vittoria che wrappa tutte queste funzioni

    function condizioneVittoria(gioc, pc) {
        gioc = giocatore1.punti;
        pc = giocatore2.punti;

        if (gioc == punteggioMassimo) {
            partitaAvviata = false;
            console.log("                                           HAI VINTO!");
            console.log("           Rematch? Riscrivi: avviaPartita(e inserisci la dimensione per la tabella)");
        }
        if (pc == punteggioMassimo) {
            partitaAvviata = false;
            console.log("                               HA VINTO IL PC... che sfortuna.");
            console.log("           Rematch? Riscrivi: avviaPartita(e inserisci la dimensione per la tabella)");
        }
    }

    //Chiedo quante navi?

    function numeroNavi(totale) {

        punteggioMassimo = totale;
        naviDisponibili = totale;
        naviAvversario = totale;

        console.log("Bene, adesso, piazza le navi! Una per volta, scrivi:");
        console.log("naveIn( numero della posizione in Y, numero della posizione in X )");
        console.log("");
        console.log("Hai da schierare: " + naviDisponibili + " navi.");

    }

    //funzione random???


    //Piazzare le navi

    function naveIn(x, y) {

        //check per il pc, per non fargli mettere due navi nella stessa posizione
        let navePiazzataBene = false;

        if (!giocatore1.tabella[x][y].piena == true) {      //controllo che non sia già piena
            if (naviDisponibili >= 2) {
                giocatore1.tabella[x][y].piena = true;
                naviDisponibili--;
                navePiazzataBene = true;
                console.log("");
                console.log("Nave schierata!");
                console.log("Hai ancora: " + naviDisponibili + " da schierare.");

            } else if (naviDisponibili == 1) {              //cambia messaggio all'ultima nave
                giocatore1.tabella[x][y].piena = true;
                naviDisponibili--;
                navePiazzataBene = true;
                console.log("");
                console.log("Tutte le navi schierate! è ora di sparare.");
                console.log("");
                console.log("Inserisci le coordinate. Scrivi:");
                console.log("sparo(numero per X , numero per Y)");

            } else {
                console.log("Non hai più navi da schierare!");
                console.log("");
                console.log("Inserisci le coordinate. Scrivi:");
                console.log("sparo(numero per X , numero per Y)");
            }
        } else {
            console.log("Non puoi mettere due navi nella stessa casella, riprova.");
        }

        if (navePiazzataBene == true) {                     //il pc piazza la sua a random
            navePiazzataBene = false;

            while (!navePiazzataBene) {
                let numeroRandom1 = Math.floor(Math.random() * giocatore2.tabella.length);
                let numeroRandom2 = Math.floor(Math.random() * giocatore2.tabella.length);
                //console.log("Nave PC: " + numeroRandom1 + " " + numeroRandom2)

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

        let sparato = false;                        //check per il pc
        let bersaglioDelGiocatore = giocatore2.tabella[y][x];


        if (bersaglioDelGiocatore.colpita == true) { //per prima cosa, controllo se la casella è già stata colpita 
            console.log("Ehi! Hai già sparato qui e non c'era niente se non l'acqua!");
            console.log("");
            console.log("Tocca al pc...");
            giocatore1.colpiSparati++;
            sparato = true;

        } else if (bersaglioDelGiocatore.piena == true) {       //è stata piazzata una nave in quella casella?
            console.log("Affondata! Hai fatto un punto!");
            console.log("");
            console.log("Tocca al pc...");
            bersaglioDelGiocatore.colpita = true;
            giocatore1.colpiSparati++;
            giocatore1.punti++;
            sparato = true;


        } else {
            console.log("Acqua!");
            console.log("");
            console.log("Tocca al pc...");
            bersaglioDelGiocatore.colpita = true;
            giocatore1.colpiSparati++;
            sparato = true;

        }

        //il pc...
        if (sparato == true) {
            sparato = false;

            while (!sparato) {
                //devo generare dei numeri random per le coordinate...
                let numeroRandom1 = Math.floor(Math.random() * giocatore2.tabella.length);
                let numeroRandom2 = Math.floor(Math.random() * giocatore2.tabella.length);
                let bersaglioDelPC = giocatore1.tabella[numeroRandom1][numeroRandom2];
                console.log("Bersaglio pc: " + numeroRandom1 + " " + numeroRandom2);

                if (bersaglioDelPC.colpita == true) { //per prima cosa, controllo se la casella è già stata colpita 
                    console.log("Arriva... hanno fatto di nuovo acqua! Tocca a te.")
                    giocatore2.colpiSparati++;
                    sparato = true

                } else if (bersaglioDelPC.piena == true) {       //è stata piazzata una nave in quella casella?
                    console.log("Arriva... ti hanno affondato una nave! Il pc ha fatto un punto! Tocca a te.")
                    bersaglioDelPC.colpita = true;
                    giocatore2.colpiSparati++;
                    giocatore2.punti++;
                    sparato = true

                } else {
                    console.log("Arriva... acqua! Tocca a te.")
                    bersaglioDelPC.colpita = true;
                    giocatore2.colpiSparati++;
                    sparato = true;

                }

                condizioneVittoria();
            }
        }
    }
//}

