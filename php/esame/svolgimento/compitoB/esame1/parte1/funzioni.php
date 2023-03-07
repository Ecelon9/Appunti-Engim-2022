<?php
function generate_list($articles){

    $html='<ol>';
    foreach ($articles as $article){
        $html.= '<li>'.$article.'</li>';

    }
    $html.='</ol>';
    return $html;
}