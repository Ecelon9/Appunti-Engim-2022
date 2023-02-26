<?php

echo "<h1>Indice</h1><br>";

$files = glob("../parte1/*");

echo "<ul>";

foreach ($files as $file) {
    
    echo "<li>
    <a href='". $file ."' target = _blank> apri </a>    
    
    </li>";

}


echo "</ul>";




?>