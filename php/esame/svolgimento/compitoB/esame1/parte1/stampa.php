<?php
if(isset($_REQUEST["text"])){
   $testo=$_REQUEST['text'];

    echo $testo . '<br>'; //normale

    echo strtolower($testo). '<br>'; //minuscolo

    echo ucfirst($testo). '<br>';// iniziale maiuscola

    echo strtoupper($testo). '<br>';//tutto maiuscolo



}
