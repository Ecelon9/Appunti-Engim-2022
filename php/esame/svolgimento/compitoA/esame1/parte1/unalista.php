<?php
require ('function.php');
$frutti = ['mela', 'pera', 'banana', 'ananas', 'uva', 'mora', 'kiwi', 'arancia'];
?>

<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>lista di frutti</title>
</head>
<body>
    <h1>lista di frutti </h1>
    <?=  list_generate($frutti) ?>
</body>
</html>
