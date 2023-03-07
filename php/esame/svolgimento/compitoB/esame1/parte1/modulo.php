<?php
if($_SERVER['REQUEST_METHOD'] == 'POST'){
    echo $_POST['text'];
} else {
    echo '
        <form action="modulo.php" method="post">
        Inserisci qui il testo
        <input type="text" name="text" >
        <input type="submit" name="invia" value="stampa il tuo testo" >
        </form>
    ';

}