<?php 
require 'vendor/autoload.php';

$folderPath = 'barcodes/barcode.jpg';

// This will output the barcode as HTML output to display in the browser
$generatorHtml = new Picqer\Barcode\BarcodeGeneratorHTML();
echo $generatorHtml->getBarcode('081231723897', $generatorHtml::TYPE_CODE_128);

echo "<hr>";

$generatorJPG = new Picqer\Barcode\BarcodeGeneratorJPG();
file_put_contents($folderPath, $generatorJPG->getBarcode('081231723897', $generatorJPG::TYPE_CODABAR));

echo '<img src="' . $folderPath . '">';


?>