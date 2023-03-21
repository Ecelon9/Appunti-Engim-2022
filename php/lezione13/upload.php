<?php
/*
Questo file gestirà la richiesta: se in GET, mostrerà il form, se in POST farà robe
*/

if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $uploaddir = 'iscrizioni/';
    $uploadfile = $uploaddir . basename($_FILES['fileToUpload']['name']);

    if (move_uploaded_file($_FILES['fileToUpload']['tmp_name'], $uploadfile)) {
        //Attenzione che move sposta fisicamente il file, senza farne una copia
        echo "File is valid, and was successfully uploaded.\n";

    } else {
        echo "error";
        
    }

    //var_dump($_FILES)

} else {
    echo '<form action="upload.php" method="post" enctype="multipart/form-data">
                Select file to upload:
                <input type="file" name="fileToUpload" id="fileToUpload">
                <input type="submit" value="Upload file" name="submit">
            </form>';

}




?>