<?php

require "test.php";

require "functions.php";

//query string : ?type=0
$type = $_GET["type"] ?? 0;

$limit = $_GET["limit"] ?? 9;

if ($type != 0) {
    echo "Hai richiesto una lista ordinata";
    echo "<br>";
    echo "Il limite è: " . $limit;

    echo lista($nomiAnimali, $type, $limit);

} else {
    echo "Hai richiesto una lista NON ordinata";
    echo "<br>";
    echo "Il limite è: " . $limit;

    echo lista($nomiAnimali, $type, $limit);

}

