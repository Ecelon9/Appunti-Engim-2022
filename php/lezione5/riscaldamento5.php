<?php

$fruits = ["apple", "banana", "cherry"];

$numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

for ($i=0; $i < count($fruits); $i++) { 
    echo $fruits[$i] . " ";
}

echo "<hr>";

foreach ($fruits as $fruit) {
    echo $fruit . " ";
}

echo "<hr>";

$j = 0 ;

while ($j < count($numbers)) {
    echo $numbers[$j] . " ";
    $j++;
}

echo "<hr>";



?>