<?php

// ottenere i nomi di file nella cartella;

$filenames = glob("files/*.json");

foreach ($filenames as $filename) {
    $json_data = file_get_contents($filename);
    $data = json_decode($json_data,1);

    echo "Sei felice oggi? " . $data["scelta"] . "<br>";
    echo "Cosa hai fatto oggi? " . $data["testo"] . "<br>";
    echo "<br>";
    
}








?>