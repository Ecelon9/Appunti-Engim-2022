<?php

function concatena($stringa1, $stringa2) {
    return $stringa1 . $stringa2;

}

function concatenaConSpazio($stringa1, $stringa2) {
    return $stringa1 . " " . $stringa2;

}

function concatenaStringhe($array) {
    $stringa = "";

    for ($i=0; $i < count($array) ; $i++) { 
        $stringa = $stringa . $array[$i];

    }

    return $stringa;
}


function concatenaStringheConSpazio($array) {
    $stringa = "";

    for ($i = 0; $i < count($array); $i++) { 
        $stringa = $stringa . $array[$i] . " ";
    }

    return $stringa;
}

/* ============================================================================================= */

function concatenaStringhe2($array) {
    $stringa = "";

    foreach ($array as $string) {
        $stringa = $stringa . $string;

    }

    return $stringa;
}


function concatenaStringheConSpazio2($array) {
    $stringa = "";

    foreach ($array as $string) {
        $stringa = $stringa . $string . " ";
        
    }

    return $stringa;
}


/* ============================================================================================= */


function concatenaStringhe3(...$array) {
    $stringa = "";

    foreach ($array as $string) {
        $stringa = $stringa . $string;

    }

    return $stringa;
}


function concatenaStringheConSpazio3(...$array) {
    $stringa = "";

    foreach ($array as $string) {
        $stringa = $stringa . $string . " ";
        
    }

    return $stringa;
}




