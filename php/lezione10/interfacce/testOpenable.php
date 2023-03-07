<?php 
require_once "class.Door.php";
require_once "class.Jar.php";

$objDoor = new Door(true);
$objJar = new Jar("jam");

function openSomething(Openable $obj) {
    $obj->open();

}

function closeSomething(Openable $obj) {
    $obj->close();

}

echo "<pre>Apro il barattolo:<br>";
openSomething($objJar);
echo "<br>";
closeSomething($objJar);
echo "<br>";

echo "<hr>";

echo "Apro la porta:<br>";
openSomething($objDoor);
echo "<br>";
closeSomething($objDoor);
echo "<br><br>";
echo "Sblocco il lucchetto:<br>";
$objDoor->__construct();
openSomething($objDoor);
echo "<br>";
closeSomething($objDoor);


?>