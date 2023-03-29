import { colors, numbers, students } from "../data.js";
import * as array from "../data.js";

let result = [];

// destructuring and spread operator

/**
 * Dall'array di colori importato dal file data.js, nominiamo il primo elemento
 * come "first", il secondo come "second" e quello che rimane, lo nominiamo "rest".
 * Stiamo creando delle variabili (first, second, rest) e gli stiamo assegnando il
 * primo, secondo valore, mentre rest sarà un array, la cui posizione 0 è uguale alla 
 * vecchia terza posizione.
 * Questa operazione NON modifica l'array originale.
 * Quindi per accedere a quegli elementi, basta chiamarli per nome di variabile.
 */
const [first, second, ...rest] = colors; // operatore spread (...)
console.log(first);
console.log(second);
console.log(rest);

/**
 * Creiamo un nuovo array che prende il contenuto di colors e aggiunge un nuovo elemento
 */
const newColors = [...colors, { id: 11, name: "pink" }];
console.log(newColors);

/**
 * Facciamo la stessa operazione per un json
 */
const [firstSrudent, secondStudent, ...restStudents] = students;
//In questo caso avremo un errore per via dei nomi uguali, quindi possiamo cambiare nome variabile
//const { first_name, last_name, age } = firstSrudent;
//const { first_name, last_name, age } = secondStudent;

const { first_name, last_name, age } = firstSrudent;
const { first_name : secondStudentFirstName, 
        last_name: secondStudentLastName, 
        age : secondStudentAge } = secondStudent;

console.log(first_name);
console.log(secondStudentFirstName);

// <------------------------------------------------------------>
// <------------------------------------------------------------>

// How to use array functions

// 1. push()                                      aggiunge all'ultima posizione
  numbers.push(5);
  // colors.push({ id: 11, name: "pink" });
// 2. pop()                                       rimuove l'ultima posizione
  // colors.pop();
// 3. unshift()                                   aggiunge alla prima posizione
  //numbers.unshift(0);
  // colors.unshift({ id: 0, name: "violet" });
// 4. shift()                                     rimuove la prima posizione
  // colors.shift();
// 5. forEach()
  //possiamo creare una funzione e passarla al forEach.
const callback = (number, index) => console.log({number : number, index : index});
  result = numbers.forEach(callback); 
// 6. map()       crea una copia di un array ed esegue delle operazioni al suo interno
  result = numbers.map((number) => number * 2);
// 7. filter()                        come map, solo che può applicare una condizione 
  result = numbers.filter((number) => number > 5);
// 8. find()            restituisce il primo elemento che corrisponde alla condizione
  result = numbers.find((number) => number === 5);
// 9. every() restituisce un booleano: true, se tutti gli elementi rispettano la condizione
  result = numbers.every((number) => number < 0);
// 10. some()         come every: true, se almeno un elemento rispetta la condizione
  result = numbers.some((number) => number > 5);
// 11. reduce()                   riduce un array ad un valore eseguendo una callback
  result = numbers.reduce((acc, number) => acc + number, 0);
  let result2 = numbers.reduce((acc, number) => acc + number, 200);
  //console.log("Risultato, partendo da 200: " + result2)
// 12. sort() mette in ordine l'oggetto passato
/**
 * prendendo il primo elemento di students, lo denominiamo "a" e il secondo "b"
 * controlliamo fra di loro per l'ordine alfabetico
 */
  result = students.sort((a, b) => a.first_name.localeCompare(b.first_name));

  //==========================================================//
  const callBack = (a, b) => {
    const {first_name: nomePrimoStud} = a;
    const {first_name: nomeSecondoStud} = b;
    nomePrimoStud.localeCompare(nomeSecondoStud)}
  result = students.sort(callBack);
  //reDesign with destructuring and callback function
// 13. reverse()
  // result = students.reverse();
// 14. isArray() 
  // result = Array.isArray(students);


 console.log(result);
  // console.log(numbers);
  // console.log(colors);