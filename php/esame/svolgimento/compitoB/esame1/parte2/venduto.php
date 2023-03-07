<?php
// leggi il nome del file ricevuto come parametro
$filename = $_GET['file'] ?? '';

if(file_exists($filename)) {
    //leggi i dati 
    $json_data = file_get_contents($filename);
    $data = json_decode($json_data, 1);
    // segna che è stato venduto
    $data['stato']='venduto';
    // salva i dati nel file
    $json_data = json_encode($data);
    file_put_contents($filename, $json_data);

   
} else {
    echo ' non trovato';
}
// mostra il link per tornare all'elenco
echo '<a href="elenco.php?">Elenco</a>';
