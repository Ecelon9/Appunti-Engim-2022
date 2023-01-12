
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
  (1,1),          
  (1,2),          
  (2,1),
  (2,2);


UPDATE studenti  
SET id = 100     
WHERE id = 1;    


/*____________________________________________________________________*/

CREATE TABLE paesi (
  cap int unsigned primary key,
  nome varchar(15) not null
);

INSERT INTO paesi(cap, nome)
VALUES
  (10019, "Torino"),
  (10020, "Napoli"),
  (10021, "Venezia");

CREATE TABLE persone (
  id int unsigned,
  nome varchar(15) not null,
  annoNascita date,
  cap int unsigned,
  primary key(id),
  foreign key (cap) references paesi(cap) 
    on update cascade on delete no action
);

INSERT INTO persone(id, nome, annoNascita, cap)
VALUES
  (1, "Sara", null, 10019),
  (2, "Stefano", "1964-03-10", 10020),
  (3, "Luca", "1999-03-15", 10021),
  (4, "Viola", "1939-12-06", 10021);

UPDATE paesi  
SET nome = "Dubai"     
WHERE nome = "Torino";   

update paesi
set cap = 10099
where nome = "napoli";


delete from persone
where cap = 10099;

DELETE from paesi
where nome = "napoli";

delete from paesi; /* questo comando svuota il contenuto preservando la tabella */


