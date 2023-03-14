<?php
/**
 * Codice sorgente riportato nel libro "Sviluppare in PHP 7" di Enrico Zimuel
 * Tecniche Nuove editore, 2017, ISBN 978-88-481-3120-9
 * @see http://www.sviluppareinphp7.it
 */

require "connessionedb.php";

if ($_SERVER['REQUEST_METHOD']==='POST'){

// riceviamo i dati ad esempio il camp name
// arbitrariamente mettiamo come name = 'Carlo'



 $sql = 'UPDATE  speakers set name = :name  WHERE id=:id';
 $sth = $db->prepare($sql);
 
 $data = [
    ':id' => $_POST['id'] ,
    ':name' => $_POST['name'] ,
    ];

 if (! $sth->execute($data)) {
     throw new Exception(sprintf(
         "Error PDO exec: %s", implode(',', $db->errorInfo())
     ));
 }
 printf("Speaker/s updated successfully!\n");
} else {
// mostra il form
// leggi i dati dell'utente e precarica il form con quelli
echo '<form method="POST">
<input type="hidden" name="id" value='.$_GET['id'].'>
<input type="text" name="name">
<input type="submit">
</form>
    ';
}



