<?php

if ($_SERVER['REQUEST_METHOD']==='POST'){
    file_put_contents('cantiere.txt',$_POST['q']);
   echo "cantiere salvato";
    
} else {

?>

 <form action="" method="POST">
nome del cantiere <textarea name="q"></textarea> 
<input type="submit">   

</form>
<?php
}
