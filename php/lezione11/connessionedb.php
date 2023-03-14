<?php



try {
	$db = new PDO('mysql:host=localhost;dbname=test;charset=utf8mb4', 'root', 'Svsw2022');
} catch (PDOException $e) {
	throw new Exception(sprintf(
		"PDO connection failed: %s\n", $e->getMessage()
	));
}
//var_dump($db);


