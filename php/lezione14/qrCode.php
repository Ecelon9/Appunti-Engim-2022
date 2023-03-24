<?php 
require "vendor/autoload.php";

use BaconQrCode\Renderer\ImageRenderer;
use BaconQrCode\Renderer\Image\ImagickImageBackEnd;
use BaconQrCode\Renderer\RendererStyle\RendererStyle;
use BaconQrCode\Writer;

$folderPath = "qrcodefiles/qrcode.png";
$msg = "Terrazza, formaggio, sgabello, borraccia blu, cazzo di gomma... eeeee CANNUCCIA!!!";

$renderer = new ImageRenderer(
    new RendererStyle(400),
    new ImagickImageBackEnd()
);
$writer = new Writer($renderer);
$writer->writeFile($msg, $folderPath);

echo '<img src="' . $folderPath . '">';




?>