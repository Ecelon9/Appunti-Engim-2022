<?php

// include "include.php";    //importa il codice

/* 
c'è anche la funzione require che è più vincolante e in caso non trovasse il file, 
genera un errore fatale e blocca il programma
*/


require_once "include.php";     // questa funzione, una volta che viene eseguita con successo, non viene più lanciata.

$totaleSomma = somma(5,4);
echo $totaleSomma;

echo "<hr>";

$totaleDifferenza = differenza(9,2);
echo $totaleDifferenza;

echo "<hr>";


print_r(width("il", "lo", "cane", "robe", "sorprendentemente"));


// esiste il passaggio per referenza e si fa aggiungendo & prima della variabile

?>