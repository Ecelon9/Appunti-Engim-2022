<?php


// leggiamo l'input dall'url con $_GET
//dobbiamo assegnarlo ad una variabile

// http://localhost:8080/serverside/lezione5/input.php?q=robba&order=altraRobba

echo $_GET["q"];

echo "<hr>";

echo $_GET["order"];

?>