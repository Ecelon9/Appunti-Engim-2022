<?php

$filenames = glob("files/*.json");

echo "<ul>";

foreach ($filenames as $filename) {
    
    echo "<li>
    <a href='scheda.php?file=". $filename ."'> apri </a>    
    
    </li>";

}

echo "</ul>";




