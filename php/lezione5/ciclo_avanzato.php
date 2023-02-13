<?php

$user = [
    "name" => "John",
    "surname" => "Doe",
    "age" => "35",
    "salary" => "35000"
];

foreach ($user as $field => $info) {
    echo $info . " ";
}

echo "<hr>";

/*
4.2) stampare gli stessi dati ma questa volta in una tabella, di una riga e
quattro colonne
*/

$html = "<table border=1>";


foreach ($user as $field => $info) {
    $html = $html . "<tr>" . "<td>" . $info . "</td>" . "</tr>";

}

echo $html;


echo "<hr>";

/*
4.3) definire un array $users che è composto da tanti array con la stessa
struttura di $user. Inserire questi dati:
*/


$users = [
    ["name" => "Mary", "surname" => "Doe", "age" => "21", "salary" => "12000"],
    ["name" => "Antony", "surname" => "Smith", "age" => "34", "salary" => "21000"],
    ["name" => "Frank", "surname" => "Marshall", "age" => "56", "salary" => "34000"]
];


/*
4.4) utilizzando due cicli annidati stampare tutto il contenuto dell’array in una
tabella, che avrà tre righe e quattro colonne
*/

$html2 = "<table border=1>";

foreach ($users as $field) {

    $html2 = $html2 . "<tr>";

    foreach ($field as $info) {

        $html2 = $html2 . "<td>" . $info . "</td>";
    }

    $html2 = $html2 . "</tr>";

}

echo $html2;

echo "<hr>";

/*
4.5) modificare la stampa della tabella per inserire una intestazione, come
prima riga usando il tag <th> in modo da avere questo effetto:
*/

$html3 = "<table border=1>";

foreach ($users[0] as $key => $value) {
    $html3 = $html3 . "<th>" . $key . "</th>";

}

foreach ($users as $field) {

    $html3 = $html3 . "<tr>";

    foreach ($field as $info) {

        $html3 = $html3 . "<td>" . $info . "</td>";
    }

    $html3 = $html3 . "</tr>";

}

echo $html3;

echo "<hr>";











?>