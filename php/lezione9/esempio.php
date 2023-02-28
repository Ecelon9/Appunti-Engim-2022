<?php 

include("Person.php");
include("Calcoli.php");

echo "<pre>";

$person1 = new Person();

$person1->setName("Matteo");
$person1->setAge(29);
echo $person1->getData() . "<hr>";

$person2 = new Person("Matteo");
echo $person2->getData() . "<hr>";

$person3 = new Person("Matteo", 18);
echo $person2->getData() . "<hr>";

echo "<br><br><hr>";

$calcoli = new Calcoli(5, 8);

echo $calcoli->__toString() . "<hr>";
echo $calcoli->massimo() . "<hr>";
echo $calcoli->minimo() . "<hr>";
echo "<br><hr>";
echo $calcoli->update(75, 28);
echo $calcoli->__toString() . "<hr>";
echo $calcoli->massimo() . "<hr>";
echo $calcoli->minimo() . "<hr>";



?>