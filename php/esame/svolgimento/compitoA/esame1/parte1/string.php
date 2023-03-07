<?php

if (isset($_GET['word'])) {
   
    echo $_GET['word'] . "<br>";
    echo strtoupper($_GET["word"]) . '<br>';
    echo strtolower($_GET["word"]) . '<br>';
    echo ucfirst($_GET["word"]). '<br>';
   
}

?>