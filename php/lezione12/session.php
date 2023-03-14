<?php

/* 
$_SESSION è una variabile superglobal di cui viene tenuta traccia lato server
e preserva certi dati (in questo caso "count") fra le varie sessioni.
Ogni sessione esiste fin quando non si chiude il browser nei cookies.
*/

//session_start(); // Questa funzione crea o avvia la sessione in base ai valori _POST o _GET che riceve

$options = ["name" => "engim"]; //Nuovo cookie per la prossima sessione che possiamo passare

session_start($options);
if (!isset($_SESSION['count'])) { //Se la sessione non esiste, avviane una
    $_SESSION['count'] = 0;
} else {
    $_SESSION['count']++; //Altrimenti incrementa
}

sleep(2);

echo "<pre>Sessione numero: " . $_SESSION['count'] . "<br>";

echo "Contenuto del cookie: ";
var_dump($_COOKIE);