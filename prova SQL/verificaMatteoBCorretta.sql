CREATE DATABASE SanValentino

CREATE TABLE Regali
(
	id int primary key,
    nome varchar(100),
    categoria varchar(20),
    costo int
)

INSERT INTO regali(id, nome, categoria, costo) 
VALUES 
(1, "scatola di cioccolatini", "cibo", 14.99),
(2, "Mazzo di rose", "fiori", 25),
(3, "Lettera romantica", "biglietto", 3.99)


CREATE TABLE fidanzati
(
	id int primary key,
    nome varchar(20),
    cognome varchar(20),
    budget int unsigned,
    idRegalo int,
  	foreign key (idRegalo) references regali(id) 
    on update cascade on delete no action
)

INSERT INTO fidanzati(id, nome, cognome, budget, idRegalo)
VALUES
(1, "sara", "rossi", 50.00, 1),
(2, "luca", "verdi", 35.00, 1),
(3, "mara", "blu", 99.00, 2),
(4, "gianni", "pini", 10.00, 3),
(5, "pinotto", "gini", 30.00, 2)

/*
Aggiornare una riga della tabella regali cambiando l’id. Posso farlo? Perchè?

UPDATE regali SET id = 9 WHERE id = 1;

Sì, si può fare, l'importante che non ci siano duplicati, perchè l'ID è la primary key
e non concede duplicati

*/

/*
Cancellare una riga della tabella fidanzati. Posso farlo? Perchè?

Non si può perchè esiste una foreing key che referenzia l'ID di regali

*/

/*
Se volessi cancellare una riga della tabella regali potrei farlo? 
Se sì in quale caso? Se no in quale caso?

Nella tabella fidanzati, abbiamo impostato le forein key, con on delete no action,
questo impedisce di cancellare un elemento referenziato

*/


ALTER TABLE fidanzati
ADD COLUMN impegnato bit;

UPDATE fidanzati 
SET impegnato = true 
WHERE nome = "sara";