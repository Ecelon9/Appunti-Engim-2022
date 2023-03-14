<?php
include 'connessione.php';

$sth = $db->query('SELECT * FROM capoluoghi');

$capoluoghi = $sth->fetchAll();

echo '<select>';
foreach ($capoluoghi as $capoluogo) {
    echo '<option value="' . $capoluogo['id'] . '">' . $capoluogo['nome'] . '</option>';
}
echo '</select>';

