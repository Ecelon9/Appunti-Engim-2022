<?php

function somma(int $a, int $b)
{
    echo $a + $b;

}

echo somma(4, 8);


// scrivere una funzione che riceve un array a due dimensioni di numeri
// che restituisce una tabella html

$arrNumeri = [
    [4, 7, 1],
    [1, 8],
    [9],
    [2, 3, 6, 7, 8]
];

function stampa($numeri){

    $html = "<table border=1>";

    foreach ($numeri as $num) {

        $html = $html . "<tr>";

        foreach ($num as $n) {

            $html = $html . "<td>" . $n . "</td>";

        }

        $html = $html . "</tr>";

    }

    echo $html;

    echo "<hr>";

}

stampa($arrNumeri);

