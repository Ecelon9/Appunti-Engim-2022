<?php


//Creare una Lista in html:
echo "<ul>";

for ($i=0; $i < 10; $i++) {
    echo "<li>" . $i . "</li>";

}

echo "</ul>";

echo "<hr>";


//Creare una Tabella in html:

echo "<table border=1>";

for ($i=0; $i < 20; $i++) {
    echo "<tr><td>La variabile i vale:</td><td>" . $i . "</td></tr>";

}

echo "</table>";

echo "<hr>";

// forEach:

$arrNumeri = [
    1,
    4,
    10,
    32
];

foreach ($arrNumeri as $numero) {
    echo "il numero vale " . $numero . "<br>";

}

echo "<hr>";

$frutti = [
    "mela" => "giallo",
    "pera" => "verde",
    "banana" => "giallo"
];

foreach ($frutti as $frutto => $colore) {
    echo "La " . $frutto . " è di colore " . $colore . "<br>";

}

echo "<hr>";


// ciclo while:


$num = count($arrNumeri);

$i = 0;

while($i < $num) {

    echo "Il numero vale " . $arrNumeri[$i] . "<br>";
    $i++;


}

echo "<hr>";



// usando il forEach, stampare in una lista non ordinata tutti i frutti gialli:



echo "<ul>";

foreach ($frutti as $frutto => $colore) {

    if($colore == "giallo") {
        echo "<li>" . $frutto . "</li>";
    } else {
        echo "<li>" . $frutto . " non è di quel colore. <br> </li>";
    }

}

echo "</ul>";

echo "<ul>";

foreach ($frutti as $frutto => $colore) {

    if($colore == "rosso") {
        echo "<li>" . $frutto . "</li>";
    } else {
        echo "<li>" . $frutto . " non è rosso <br> </li>";
    }

}


echo "</ul>";


/*            */

$numeri = [
    [10, 2],
    [3, 2],
    [2, 3]
];


echo "<table border=1>";

foreach ($numeri as $num) {

    echo "<tr>" . $num . "</tr>";

    foreach ($num as $n) {

        echo "<td>" . $n . "</td>";

    }

}

echo "</table>";

echo "<hr>";

echo "<table border=1>";

foreach ($numeri as $num) {

    echo "<tr>";

    foreach ($num as $n) {

        echo "<td>" . $n . "</td>";

    }

    echo "</tr>";

}

echo "</table>";

echo "<hr>";

// aggiungiamo tutti i valori ad una variabile unica

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



