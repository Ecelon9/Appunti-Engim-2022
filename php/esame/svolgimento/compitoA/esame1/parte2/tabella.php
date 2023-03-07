<!doctype html>
<html lang="it">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Tabella</title>
  </head>
  <body>
    <?php
    require('dati.php');
    require('intestazione.php');
 
    // leggi i dati inseriti dall'utente e imposta i default
    // default per l'attributo value nel form
    $val_ora_inizio = !empty($_GET['orainizio']) ? intval($_GET['orainizio']) : '';
    $val_ora_fine= !empty($_GET['orafine']) ? intval($_GET['orafine']) : '';
    
    // default per l'iteratore
    $ora_inizio =  !empty($_GET['orainizio']) ? intval($_GET['orainizio']) : 0;
    $ora_fine = !empty($_GET['orafine']) ? intval($_GET['orafine']) : 23;
   

  // print table
    echo '<div class="container my-5">
            <h1>' . nomeCantiere() . '</h1>
                <form>
                     ora inizio <label for=""></label>
                     <input type="text" name="orainizio" value="'.$val_ora_inizio.'">
                     ora fine <label for=""></label>
                     <input type="text" name="orafine" value="'.$val_ora_fine.'">
                     <input type="submit" value="invia">
                 </form>';

    echo '<table class="table">
                <thead>
                  <tr>
                  <th scope="col">Ora</th>
                  <th scope="col">Numero di carriole</th>
                  <th scope="col">Numero di carri</th>
                  <th scope="col">Numero di camion</th>
                  <th scope="col">Kg complessivi trasportati</th>
                  </tr>
                  </thead>
                  <tbody>';
    foreach($trasporti as $ora=>$riga){
      if ($ora>= $ora_inizio && $ora<=$ora_fine){
        // calcola il peso trasportato
        $kg =$riga['CLA']* 100 + $riga['CRO']* 500 +$riga['CMI']*4000 ;
        echo '<tr>';
        echo '<td>'.$ora.'</td>';
        echo '<td>'.$riga['CLA'].'</td>';
        echo '<td>'.$riga['CRO'].'</td>';
        echo '<td>'.$riga['CMI'].'</td>';
        echo '<td>'.$kg.'</td>';
        echo '</tr>';
      }
      
    }
  
      echo'          </tbody>
        </div>';

   
    ?>
     </body>
</html>
