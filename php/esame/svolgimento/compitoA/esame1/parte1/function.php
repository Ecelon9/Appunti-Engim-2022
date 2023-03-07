<?php

function list_generate($articles){
    $string= '<ul>';
    foreach($articles as $article){
       $string.='<li>' . $article . '</li>';
    }
    $string .='</ul>';
    return $string;
}
?>