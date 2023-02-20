<?php

echo "Hello there! <hr>";

$numeri = [
    4,
    10,
    30
];

$tot = $numeri[0] + $numeri[1] + $numeri[2];

echo "Il totale dei numeri nell'array è: " . $tot . "<hr>";

$allievo = [
    "nome" => "Matteo",
    "cognome" => "Bologna"
];

echo "il mio nome è " . $allievo["nome"] . " e il mio cognome è " . $allievo["cognome"] . "<hr>";