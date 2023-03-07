<?php

//link per inserire una nuova scheda
echo '<a href="nuova_scheda.php">Inserisci nuova scheda</a>';

$filenames = glob('schede/*.json');

//print_r($filenames);

echo '<ul>';
foreach($filenames as $filename) {
    echo '<li><a href="scheda.php?file='. $filename .'">Link alla scheda: '.$filename.'</a>
    </li>';
}

echo '</ul>';