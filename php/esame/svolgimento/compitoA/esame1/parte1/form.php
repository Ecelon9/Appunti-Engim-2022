<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>


</body>
</html>

<?php
if ($_SERVER['REQUEST_METHOD']=='POST'){
    echo $_POST["q"];
} else {

?>

 <form action="" method="POST">
Inserisci testo <input type="text" name="q">
<input type="submit">   
</form>
<?php
}