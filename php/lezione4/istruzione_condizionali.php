<?php


// un numero maggiore di 0 è un valore true:

// $num = 0; // è falso.
$num = 30; // è vero

if ($num) {
    echo "è vero <br>";
} else {
    echo "è falso <br>";
}

echo "fine <hr>";
/*
// una stringa vuota è un valore false:
//$stringa = "" //falso
$stringa = "Hello there!" //vero
if ($stringa) {
echo "è vero <br>";
} else {
echo "è falso <br>";
}
echo "fine <hr>";
*/


echo "Vediamo l'If-Else <br>";

$nome = "matteo";

if ($nome == "matteo") {
    echo "mare <br>";

} else if ($nome == "marcello") {
    echo "montagna <br>";

} else if ($nome == "margherita") {
    echo "lago";

} else {
    echo "casa";

}

echo "fine <hr>";


echo "Vediamo lo switch <br>";

switch ($nome) {
    case 'matteo':
        echo "mare <br>";
        break;
    
    case "marcello":
        echo "montagna <br>";
        break;

    case "margherita";
        echo "lago";
        break;

    default: //else
        echo "casa";
        break;
}

echo "fine <hr>";



echo "esecizio: <br>";

$stati_spedizione = [
    ["codice" => 10, "descrizione" => "preso in carico <hr>"],
    ["codice" => 20, "descrizione" => "in consegna alla sede centrale <hr>"],
    ["codice" => 30, "descrizione" => "in transito verso il magazzino <hr>"],
    ["codice" => 40, "descrizione" => "in giacenza presso magazzino <hr>"],
    ["codice" => 50, "descrizione" => "in transito verso il cliente <hr>"],
    ["codice" => 60, "descrizione" => "consegnato <hr>"]
];

$stato_spedizione = 40;

switch ($stato_spedizione) {
    case 10:
        echo "preso in carico <hr>";
        break;

    case 20:
        echo "in consegna alla sede centrale <hr>";
        break;

    case 30:
        echo "in transito verso il magazzino <hr>";
        break;

    case 40:
        echo "in giacenza presso magazzino <hr>";
        break;

    case 50:
        echo "in transito verso il cliente <hr>";
        break;

    case 60:
        echo "consegnato <hr>";
        break;

    default:
        echo "ancora da prendere in carico <br>";
        break;
}












