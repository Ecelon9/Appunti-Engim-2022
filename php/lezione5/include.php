<?php

function somma(int $a, int $b) :int {

    $tot = $a + $b;

    return $tot;
}

function differenza (int $a, int $b)  {

    $tot = $a - $b;

    return $tot;
}

//operatore variadic ... 
//serve per passare un qualsiasi numero di elementi ad una funzione

function width(string ...$words) :array {

    $width = []; //dichiaro array vuoto

    foreach ($words as $w) {
        
        $width[] = strlen($w);
//in questo modo aggiungo $w all'ultima posizione nell'array $width

    }

    return $width;

}









?>