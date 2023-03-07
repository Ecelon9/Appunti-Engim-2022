<?php
function nomeCantiere(){
    $nome = file_get_contents('cantiere.txt');
    return $nome;
}