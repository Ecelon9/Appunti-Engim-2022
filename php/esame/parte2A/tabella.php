<?php

require("dati.php");

function mostraTabella($dati) {

    $html = "<table border=1>" .
    "<th> h </th>" .
    "<th> CLA </th>" .
    "<th> CRO </th>" . //Non riesco a recuperare le chiavi nel foreach...
    "<th> CMI </th>" .
    "<th> kg totali </th>";

    foreach ($dati as $ore => $val) {
        $cla = 0;
        $cro = 0;
        $cmi = 0;
        $html .= "<tr><td><b>" . $ore . "</b></td>";
    
        foreach ($val as $key => $passaggi) {
    
            switch ($key) {
                case 'CLA':
                    $html .= "<td>" . $passaggi . "</td>";
                    $cla += ($passaggi * 100);
                    break;
    
                case 'CRO':
                    $html .= "<td>" . $passaggi . "</td>";
                    $cro += ($passaggi * 500);
                    break;
    
                case 'CMI':
                    $html .= "<td>" . $passaggi . "</td>";
                    $cmi += ($passaggi * 4000);
                    break;
    
                default:
                    break;
    
            }
        }
        $kgTot = $cla + $cro + $cmi;
        $html .= "<td>" . $kgTot . "</td></tr>";
    
    }
    echo $html;

}

mostraTabella($trasporti);











?>