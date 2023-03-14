<?php

session_start();

if (!isset($_SESSION["armadio"])) {
    //creiamo degli elementi legati alla sessione

    $_SESSION["armadio"] = ["maglia", "camicia", "pantaloni", "mutande"]; 
    $_SESSION["valigia"] = [];

}

//Gestiamo input utente

if (isset($_GET["action"]) && 
isset($_GET["action"]) == "prendi" && 
isset($_GET["id"])) {
    //sposta entità

    $id = $_GET["id"]; //ricevo l'id dell'oggetto

    if ($_SESSION["armadio"][$id] != null) { //se id è diverso da null
        $_SESSION["valigia"][] = $_SESSION["armadio"][$id]; //lo aggiungo all'ultima posizione dell'array valigia
        unset($_SESSION["armadio"][$id]); //e dall'array d'origine, lo rimuovo
        header("location: armadio.php"); //A questo punto forziamo il browser a ricaricare la pagina senza puntare al cookie
        die();

    }
}

if (isset($_GET["action"]) && //se id è settata action
isset($_GET["action"]) == "togli" &&  //action è = a "togli"
isset($_GET["id"])) {  

    $id = $_GET["id"];

    if ($_SESSION["valigia"][$id] != null) { //se è diverso da null
        $_SESSION["armadio"][] = $_SESSION["valigia"][$id]; //Allora sposta l'elemento
        unset($_SESSION["valigia"][$id]); 
        header("location: armadio.php");
        die();

    }
}

//mostra elementi

echo "<pre><h2>Armadio</h2>";

$html = "<ul>";

foreach ($_SESSION["armadio"] as $id => $item) { //id è = alla posizione nell'array e item è il suo contenuto
    $html .= '<li><a href="? action=prendi&id='. $id .'">' . $item . '</a></li>';
    //Notare che scrivendo un href in questo modo, il browser punta automanticamente a se stesso

}
$html .= '</ul>';

echo $html;

if($_SESSION["armadio"] == null) {
    echo "L'armadio è vuoto";

}

echo "<br>";

echo "<pre><h2>Valigia</h2>";

$html = "<ul>";

foreach ($_SESSION["valigia"] as $id => $item) {
    $html .= '<li><a href="? action=togli&id='. $id .'">' . $item . '</a></li>';

}
$html .= '</ul>';

echo $html;

if($_SESSION["valigia"] == null) {
    echo "Per adesso la valigia è vuota";

}

echo '<br><br><a href="reset.php">RESET</a>'; 
//chiama un file che distrugge l'array "armadio", in modo da farlo ricreare per la sessione nuova


