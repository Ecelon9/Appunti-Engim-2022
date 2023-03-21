<?php

require 'Persona.php';
require 'Giornale.php';


$persona = new Persona('Carlo');

$persona->stampa();

$giornale = new Giornale();

$giornale->stampa();



