
/* SQLfiddle
Creiamo una nuova tabella chiamata "prova" che deve avere almeno una chiave primaria,
per essere sicuri che non possano essere doppioni:
*/

CREATE TABLE prova            
(                             
  id int(6) primary key,      /* <- Stiamo inserento (6) slot di memoria */
  nome varchar(20) not null   /* <- per il tipo int e (20) per il varchar */
  primary key(id, nome)
);                          

/*
La chiave primaria è importante perchè impedisce che ci siano duplicati e definisce
esattamente a quale dato mi sto riferendo. Sono obbligatorie.

La foreign key(o chiave secondaria) serve per referenziare più dati fra di loro.
*/

/*
A questo punto, inseriamo i dati:
*/

INSERT INTO prova(id, nome)   /* Comando per inserire Dentro a "prova" */
VALUES                        /* secondo la sequenza che gli diamo noi */
(1, "gianni"),       
(2, "pinotto"),
(3, "framario");

/*
Una volta creata, possiamo usarla:
*/

SELECT * FROM prova;          /* "*" sta per all/tutto */
SELECT nome FROM prova;
SELECT id FROM prova;

/*__________________________________________________________________*/

CREATE TABLE studenti ( 
  id int(5) primary key,
  nome varchar(15) not null
  );
 
INSERT INTO studenti(id, nome)
VALUES
  (1, "gianni"),
  (2, "pinotto"),
  (3, "framario"),
  (4, "scugnamiglio"),
  (5, "GVNN");
 
 
CREATE TABLE corsi (
  id int(5) primary key,
  nome varchar(50) not null
  );
  
INSERT INTO corsi(id, nome)
VALUES
  (1, "Tecnico sviluppo software"),
  (2, "Tecnico servizio Cloud");

 
CREATE TABLE frequenta (
  idStud int(5),
  idCorso int(5),
  primary key (idStud, idCorso),
  foreign key (idStud) references studenti(id) on update cascade,
  foreign key (idCorso) references corsi(id) on update cascade
  );
  
INSERT INTO frequenta (idStud, idCorso)
VALUES
  (1,1),          /* Assegnamo gli id degli studenti */
  (1,2),          /* agli id dei corsi che frequentano */
  (2,1),
  (2,2);


UPDATE studenti  /* qui stiamo andando a cambiare l'id numero 1, in numero 100 */
SET id = 100     /* e siccome abbiamo inserito l'update a cascata, noteremo che la modifica */
WHERE id = 1;    /* verrà applicata a tutti gli id numero 1 */

/* 
Stiamo facendo un aggiornamento all'interno della tabella "studenti":
settiamo quale oggetto vogliamo inserire
e gli diamo la condizione, in questo caso: "l'id dev'essere 1"
quindi alla fine ci troveremo il nuovo nome legato all'id scelto.
*/

/*
Impostando sulla foreing key, l'istruzione on update cascade, quando andremo a fare una modifica 
in una tabella, effettuerà l'aggiornamento a tutti gli elementi di quel valore.
Stessa cosa per la on delete cascade - cancellerà tutti gli elementi con quel valore.
*/

/*
Non è obbligatorio specificare la dimensione di un oggetto, per esempio:
  idStud int(5) <- idStud avrà 5 campi di tipo int, pre-allocati.
Volendo possiamo lasciare int senza parentesi e sql userà un valore di default.
In aggiunta, se mettssimo id UNSIGNED, impediamo che vengano inseriti valori con segni,
quindi non sarà possibile aggiungere un valore negativo.
*/

/*
Se specifichiamo che un campo non può essere null (NOT NULL), quando inseriamo
i valori, non possiamo lasciare il campo vuoto, perchè sql si aspetterà un campo NON vuoto,
quindi durante l'inserimento (rispettando la sequenza di valori), dovremo inserire NULL,
nel valore che vogliamo inserire vuoto
*/

/*
Attenzione al valore NULL perchè non può essere confrontato. Quindi se volessimo verificare se
dei valori siano NULL, bisogna scrivere 

WHERE IS null (oppure not null)
*/

/*_________________________________________________________________________________________________________*/



/* Usa la tabella orderDetails per mostrare numero d’ordine, numero di linea, e il prodotto tra quantity e price, 
odina per quantity*price decrescente.*/

SELECT orderNumber, orderLineNumber, quantityOrdered* priceEach
FROM orderdetails
ORDER BY priceEach*quantityOrdered;


/*Per fornire un ordine che non sia né crescente né decrescente, ma che segua una convenzione data da me, 
si usa il comando FIELD. */

SELECT orderNumber, status
FROM orders
ORDER BY FIELD(status,
        'In Process',
        'On Hold',
        'Cancelled',
        'Resolved',
        'Disputed',
        'Shipped');

/*__________________________________________________________________________________________________________*/


SELECT concat(firstName, " ", lastName) as nomi, jobTitle /* Raggruppiamo i nomi in una nuova tabella chiamata nomi */
from employees 
WHERE jobTitle = "Sales rep" 
order by nomi desc, jobTitle;


/*Se eseguo la seguente query cosa succede? Cosa fa l’operatore BETWEEN? */

SELECT firstName, lastName, officeCode
FROM employees
WHERE officeCode BETWEEN 1 AND 3 /* estremi inclusi */
ORDER BY officeCode;

/* Aggiungi la condizione che abbiano creditlimit > 100000; Qui servono le parentesi? Cosa viene fuori se non le uso? */

SELECT c.customerName, c.country, c.creditLimit
FROM customers c
WHERE (c.country = 'USA' OR c.country = 'France') AND c.creditLimit > 100000
ORDER BY c.creditLimit;

/* è importante la parentasi perchè potrebbe comportarsi in maniera imprevedibile */

/* mia soluzione: */

SELECT c.customerName, c.country, c.state, c.creditLimit
FROM customers as c 
where c.country = "USA" OR c.country = "CA"
order by c.creditLimit > 100000 desc;

/*

SELECT (DISTINCT) (AVG, MAX, MIN, SUM, COUNT)       Seleziona un attributo
FROM                                                Indica da che tabella prendere le informazioni
JOIN (INNER/LEFT/RIGHT)                             Unisce più tabelle con lo stesso attributo, in una nuova tabella
WHERE (IN, NOT IN)                                  Seleziona solo le righe che soddisfano la richiesta e non mostra le altre
GROUP BY                                            Raggruppa gli elementi per attributo comune
HAVING                                              Come la WHERE dove si può specificare una casistica (quantità > 100)

*/


