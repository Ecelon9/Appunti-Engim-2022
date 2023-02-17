<?php

require "stringhe.php";

$testo1 = "tutte";
$testo2 = "cose";

$arrTesto = ["cane", "gatto", "elefante", "mela", "pera", "banana"];

echo "Concatena: " . concatena($testo1, $testo2);

echo "<hr>";

echo "Concatena con spazio: " . concatenaConSpazio($testo1, $testo2);

echo "<hr>";

echo "Concatena stringhe: " . concatenaStringhe($arrTesto);

echo "<hr>";

echo "Concatena stringhe con spazio: " . concatenaStringheConSpazio($arrTesto);

echo "<hr>";

echo "Concatena stringhe 2: " . concatenaStringhe2($arrTesto);

echo "<hr>";

echo "Concatena stringhe con spazio 2: " . concatenaStringheConSpazio2($arrTesto);

echo "<hr>";

echo "Concatena stringhe 3: " . concatenaStringhe3(...$arrTesto);

echo "<hr>";

echo "Concatena stringhe con spazio 3: " . concatenaStringheConSpazio3(...$arrTesto);

echo "<hr>";











