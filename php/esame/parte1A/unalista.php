<?php

echo "<h1>Lista frutta</h1><br>";

require("functions.php");

echo "<title>Lista frutti</title>";

$frutti = [
    "mela",
    "pera",
    "banana",
    "ananas",
    "pesca",
    "albicocca",
    "settimo frutto",
    "ottavo frutto"
];

echo list_generate($frutti);



?>