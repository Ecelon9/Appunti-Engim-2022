
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




