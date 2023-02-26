<?php

echo "<h1>Funzione genera lista</h1><br>";

function list_generate($articles) {
    
$html = "<ul>";

    foreach ($articles as $article) {

        $html = $html . "<li>" . $article . "</li>";
    }

$html = $html . "</ul>";

return $html;

}


?>