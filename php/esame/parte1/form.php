<?php

echo "<h1>Form</h1><br>";

if ($_SERVER["REQUEST_METHOD"] === "POST") {

    $data["testo"] = trim($_REQUEST["testo"]);
    $json_data = json_encode($data);
    echo $json_data;
    echo "<br>";

} else {

    echo "<form method='POST'>";
    echo "<input type='textarea' name='testo'>";
    echo "<input type='submit'>";
    echo "</form>";

}





?>