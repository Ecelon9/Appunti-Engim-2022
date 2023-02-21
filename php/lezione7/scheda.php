<?php

$filename = $_GET["file"] ?? "";


if (file_exists($filename)) {
    echo "Leggo il contenuto:<br>";
    $json_data = file_get_contents($filename);
    $data = json_decode($json_data,1);

    echo "Sei felice oggi? " . $data["scelta"] . "<br>";
    echo "Cosa hai fatto oggi? " . $data["testo"] . "<br>";
    echo "<br>";


} else {
    echo $filename . " non trovato";

}