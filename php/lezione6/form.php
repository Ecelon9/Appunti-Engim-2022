<?php

if ($_SERVER["REQUEST_METHOD"] === "POST") {
    //Salva i dati in un json
    $data["nome"] = trim($_REQUEST["nome"]);
    $data["psw"] = md5($_REQUEST["psw"]); //md5 cripta il contenuto
    $json_data = json_encode($data);
    echo $json_data; // da salvare in un file
    echo "<br>";

} else {
    //mostrare il form
    echo "<form method='POST'>";
    echo "<input type='text' name='nome' placeholder='nome'>";
    echo "<br>";
    echo "<input type='password' name='psw' placeholder='password'>";
    echo "<br>";
    echo "<input type='submit'>";
    echo "</form>";

}