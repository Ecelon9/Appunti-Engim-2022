
//ESERCIZIO 1:
//scrivere una funzione che dato in input un array con la struttura data dall'esempio
//restituisca in output il numero di volte in cui la categoria è "CAT1"


let inputarray = [
    { name: 'FD', categoria: 'CAT1' },
    { name: 'DF', categoria: 'CAT2' },
    { name: 'HJ', categoria: 'CAT3' },
    { name: 'KL' },
    { name: 'CV', categoria: 'CAT2' },
    { name: 'KL', categoria: 'CAT1' }
];

let totale = 0;

// for (let i = 0; i < inputarray.length; i++) {

//     if (inputarray[i].categoria == 'CAT1') {
//         totale++; 
//     }
// }

//console.log("Nell'array sono presenti " + totale + " CAT1");

inputarray.forEach(element => {
    if (element.categoria == "CAT1") {
        totale++;
    }
});

console.log("Nell'array sono presenti " + totale + " CAT1");

// ESERCIZIO 2:
// ESERCIZI SUI TIPI: operazioni tra tipi

var ret
ret = 1 + 5             // 6 number
ret = 1 + '5'           // 15 string
ret = '1' + 5           // 15 string

var a = '1'
ret = a + 1             // 11 string
ret = 1 + 2 + 3 + '4'   // 64 string
ret = '' + 1            // 1 string

var b
ret = b + 1             // NaN

// ESERCIZIO 3:
// scrivere una funzione che accetti in input un array di int e restituisca in output la somma di tutti  gli elementi

let arrayInt = [5, 7, 2, 10, 38, 24, 15];

// function somma() {
//     let totale = 0;

//     for (let i = 0; i < arrayInt.length; i++) {
//         totale = totale + arrayInt[i];        
//     }

//     return totale;
// }

// console.log(somma(arrayInt));

function somma() {
    let totale = 0;

    arrayInt.forEach(element => {
        totale = totale + element;

    });
    return totale;
}

console.log("La somma di tutti i valori dell'array è: " + somma(arrayInt));



//ESERCIZIO 4:
//scrivere una funzione che accetti in input un array di array e restituisca in output la somma di tutte le lunghezze

let array1 = [3, 7];
let array2 = [23];
let array3 = [9, 5, 2, 1, 8,];

let array = [array1, array2, array3]

function lunghezza() {

    for (let i = 0; i < array.length; i++) {
        let len = array[i].length;
        console.log("L'array alla posizione " + i + " ha lunghezza " + len);

    }
    return
}

lunghezza(array)



/*
ESERCIZIO 5:
abbiamo un JSON così definito:
JSON studente = {"nome": "nome1", "cognome": "cognome1", "presenze": [4,5,7,8]}

scrivere una funzione che ha in input un array i cui elementi sono del tipo descritto in JSON studente 
e restituisce in output la somma delle sue presenze
NB: l'array presenze contiene il numero di un giorno a partire dal 1/1 
considerando che il 1/1 vale 1, il 1/2 vale 32, il 31/12 vale 365

esempio
studente.presenze => [4,5,7,8]
studente.presenze.len => 4
*/

let studente1 = {
    nome: "studente",
    cognome: "1",
    presenze: [4, 5, 7, 8, 9]
}

let studente2 = {
    nome: "studente",
    cognome: "2",
    presenze: [4, 5, 6]
}

let studente3 = {
    nome: "studente",
    cognome: "3",
    presenze: [3, 4, 5, 8]
}

// let presenze = function () {

//     for (let index = 0; index < this.presenze.length; totale++) {
//         let totale = 0;
//         return totale;
//     }
// }

// console.log(presenze(studente1))

function numeroPresenze(studente1) {
    let totale = 0;

    presenze.forEach(element => {
        totale = presenze.length

    });
}

console.log(numeroPresenze(studente1))