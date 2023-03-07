<?php 

include("HtmlList.php");

$array = ["cane" . "gatto" . "furetto"];

$htmlList = new HtmlList($array);


//var_dump($htmlList);
echo $htmlList->setType();
echo $htmlList->getHtmlList();






?>