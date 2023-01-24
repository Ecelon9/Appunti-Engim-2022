
// Esercizio 4

let studenti = [
    {
        studente: "pippo",
        materie: [
            { materia: "italiano", voto: 4 },
            { materia: "storia", voto: 5 },
            { materia: "geografia", voto: 6 },
            { materia: "informatica", voto: 8 }
        ]
    },
    {
        studente: "pluto",
        materie: [
            { materia: "italiano", voto: 6 },
            { materia: "storia", voto: 7 },
            { materia: "geografia", voto: 4 },
            { materia: "informatica", voto: 8 }
        ]
    },
    {
        studente: "paperino",
        materie: [
            { materia: "italiano", voto: 6 },
            { materia: "storia", voto: 9 },
            { materia: "geografia", voto: 4 },
            { materia: "informatica", voto: 7 }
        ]
    },
    {
        studente: "minnie",
        materie: [
            { materia: "italiano", voto: 7 },
            { materia: "storia", voto: 7 },
            { materia: "geografia", voto: 8 },
            { materia: "informatica", voto: 6 }
        ]
    },
    {
        studente: "paperina",
        materie: [
            { materia: "italiano", voto: 4 },
            { materia: "storia", voto: 6 },
            { materia: "geografia", voto: 8 },
            { materia: "informatica", voto: 8 }
        ]
    },
    
];

// Ciclo tutti gli studenti nell'array

for (let i = 0; i < studenti.length; i++) {
    console.log(avviaValutazione(studenti[i]))
    
}

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


/* =============================================================== */

// Esercizio 6

// Ciclo tutti gli studenti nell'array

for (let i = 0; i < studenti.length; i++) {
    console.log(valutazionePerMateria(studenti[i], "italiano"))
    //console.log(valutazionePerMateria(studenti[i], "storia"))
    //console.log(valutazionePerMateria(studenti[i], "geografia"))
    //console.log(valutazionePerMateria(studenti[i], "informatica"))

}

// Ciclo tutte le materie in base a quella nel parametro

function valutazionePerMateria(studenteCorrente, materiaInput) {
    let sufficienti = 0;
    let insufficienti = 0;

    studenteCorrente.materie.forEach(element => {
        if (element.materia == materiaInput) {
            if (element.voto >= 6) {
                sufficienti++;

            } else {
                insufficienti++;

            }
        }
    });

    let valutazione = {
        nome: materiaInput,
        alunni_con_suff: sufficienti,
        alunni_con_insuff: insufficienti
    };

    return valutazione

}






