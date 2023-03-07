<?php
// leggi il nome del file ricevuto come parametro
$filename = $_GET['file'] ?? '';

if(file_exists($filename)) {
    //leggi i dati dal file
    $json_data = file_get_contents($filename);
    // decodifica i dati dal json
    $data = json_decode($json_data, 1);


    //mostra  i dati
    echo 'Tipo: ' . $data['tipo'];
    echo '<br>';
    echo 'Nome: ' . $data['nome'];
    echo '<br>';
    echo 'Carattere: ' . $data['carattere'];
    echo '<br>';
    echo 'Alimentazione: ' . $data['alimentazione'];
    echo '<br>';
    echo 'Genitori e storia: ' . $data['genitori'];
    echo '<br>';
    echo 'Anno di nascita: ' . $data['nascita'];
    echo '<br>';
    echo 'Prezzo: ' . $data['prezzo'];
    echo '<br>';
    echo 'Stato: ' . $data['stato'];
    echo '<br>';
    echo '<br>';
} else {
    echo ' non trovato';
}
// mostra il link per segnare che l'animale è stato venduto
echo '<button><a href="venduto.php?file='.$filename.'">Venduto</a></button>';
