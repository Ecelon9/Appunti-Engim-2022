
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