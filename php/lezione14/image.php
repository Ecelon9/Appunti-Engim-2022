<?php 

require "vendor/autoload.php";

use Spatie\Image\Image;

//__DIR__ fa riferimento al path fisico, assoluto.

$pathToImage = __DIR__ . "/srcimages/image.jpg"; //path sul disco
$pathToNewImage = "images/newImage.jpg";

// modifying the image so it fits in a 100x100 rectangle without altering aspect ratio
Image::load($pathToImage)
   ->width(800)
   ->height(600)
   ->save($pathToNewImage);


// rotate the image and sharpen it
Image::load($pathToImage)
   //->orientation(45)
   ->sharpen(10)
   ->save($pathToNewImage);


echo '<img src="' . $pathToNewImage. '">';

?>