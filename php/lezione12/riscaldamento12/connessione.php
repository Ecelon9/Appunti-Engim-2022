<?php

try {
	$db = new PDO( //Portable Data Object - classe di connessione al db
		'mysql:host=localhost;dbname=test;charset=utf8mb4',
		'root',
		'Svsw2022',
		[PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION]
	);
} catch (PDOException $e) {	//intercettiamo un possibile che possa generarsi
	echo $e->getMessage();
	die;

}