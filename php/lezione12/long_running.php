<?php

session_start();

if (!isset($_SESSION['count'])) {
    $_SESSION['count'] = 0;

} else {
    $_SESSION['count']++;

}
/**
 * Ogni volta che si utilizzano variabili di sessione, è bene che si utilizzino per il minor tempo possibile
 * perchè ogni sessione è mutuamente esclusiva, ovvero che: finquando una sessione è attiva, le altre richieste
 * alla stessa risorsa rimangono in attesa.
 */

sleep(5); 
$conto = $_SESSION["count"];

session_commit(); //Questa funzione, chiude la sessione e salva i suoi dati

sleep(5);   //Simuliamo un operazione molto lenta in cui il mio programma opera.
$conto++;   //Se nel frattempo volessi avviare da browser il file hello.php,
sleep(5);   //in questo lasso di tempo, posso aprirlo, altrimenti rimarrebbe in attesa 
            //se la sessione fosse aperte

session_start();    //riapro la sessione e eseguo altre operazioni "a sessione"

$_SESSION["count"]=$conto;

echo "<pre>Sessione numero: " . $conto . "<br>";

echo "Contenuto del cookie: ";
var_dump($_COOKIE);

session_commit();

?>