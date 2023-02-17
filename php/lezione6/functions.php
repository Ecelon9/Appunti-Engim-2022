<?php

function lista($array, $type = 0, $limit = 10){

    $listaOrd = ["<ol>", "</ol>"];

    $listaNonOrd = ["<ul>", "</ul>"];

    if ($limit != 0) {
        $array = array_slice($array, 0, $limit);

    }

    if ($type > 0) {
        $html = $listaOrd[0];
        sort($array);

        foreach ($array as $string) {
            $html = $html . "<li>" . $string . "</li>";

        }
        $html = $html . $listaOrd[1];

    } else {
        $html = $listaNonOrd[0];

        foreach ($array as $string) {
            $html = $html . "<li>" . $string . "</li>";

        }
        $html = $html . $listaNonOrd[1];

    }

    return $html;

}