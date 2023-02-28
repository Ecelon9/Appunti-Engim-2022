<?php

echo "<h1>Scrivere ?q=Hello</h1><hr>";

$query = $_GET["q"];

echo $query . " ";
echo strtoupper($query) . " ";
echo strtolower($query) . " ";
echo ucfirst($query) . " ";


?>