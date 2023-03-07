<?php
$nomi=['Maria','Giovanni','Francesco','Pietro','Emanuel','Edoardo','Gianluca','Sergio'];

require ('funzioni.php');

echo ' <head><title>nomi propri</title></head>';

echo '<body><h1>nomi propri </h1>';

echo   generate_list($nomi); 
echo '</body>';