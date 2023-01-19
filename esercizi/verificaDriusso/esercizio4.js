/*
Vogliamo gestire una statistica dell'andamento degli studenti di una classe.
Abbiamo a disposizione i dati delle pagelle degli studenti in un formato json come descritto 
nell'esempio jsonInput.
Vogliamo in output il resoconto per ogni studente del numero di materie insufficienti e sufficienti 
(la sufficienza è >= 6). I voti sono di tipo intero.
Scrivere il diagramma di flusso (anche non completo nei dettagli, l'importante è il flusso di massima).
Scrivere inoltre in javascript una funzione che accetti in input un array di json definito in jsonInput, e 
restituisca in output un nuovo array di json che contenga per ogni elemento dell'array un json con per ogni 
studente il suo nome, numero di insifficienze, numero di sufficienze
*/

let studenti = [
    {
        studente: "pippo",
        materie: [
            { materia: "italiano", voto: 9 },
            { materia: "storia", voto: 5 },
            { materia: "geografia", voto: 6 },
            { materia: "informatica", voto: 8 }
        ]
    },
    {
        studente: "pluto",
        materie: [
            { materia: "italiano", voto: 9 },
            { materia: "storia", voto: 5 },
            { materia: "geografia", voto: 6 },
            { materia: "informatica", voto: 8 }
        ]
    }
];

// Elaboro uno studente per volta,
// input = jsonStudente
// output = jsonValutazione dello studente corrente


function avviaValutazione(studenteCorrente) {
    let sufficienti = 0;
    let insufficienti = 0;

    studenteCorrente.materie.forEach(element => {

        if (element.voto >= 6) {
            sufficienti++;

        } else {
            insufficienti++;

        }
    });

    let valutazione = {
        nome: studenteCorrente.studente,
        numero_materie_suff: sufficienti,
        numero_materie_insuff: insufficienti
    };

    return valutazione

}


console.log(avviaValutazione(studenti[0]))

console.log(avviaValutazione(studenti[1]))

