<?php
print_r($_SERVER['REQUEST_METHOD']);


if($_SERVER['REQUEST_METHOD'] === 'POST'){
    
    $data['scelta']= $_POST['scelta'] ?? 'undefined';
    $data['testo']= $_POST['testo'] ?? 'undefined';
    // save data in file 
    $json_data = json_encode($data);
    $filename = "files/" . uniqid() . ".json";
    file_put_contents($filename, $json_data);


} else {
    // display form
    echo '<form method="post">
        sei felice oggi ? 
        <input type="radio" name="scelta" value="si">si 
        <input type="radio" name="scelta" value="no">no <br>
        <textarea name="testo" cols="30">  </textarea><br>
        <input type="submit" value="submit">
        </form>';

}













