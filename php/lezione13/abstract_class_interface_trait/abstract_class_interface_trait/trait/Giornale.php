<?php

require_once 'Utility.php';

class Giornale{
    use Utility;

    private $date;


    public function __construct(){
        $this->date='oggi è il giorno ' . date('Y-m-d') ;
    }

    public function stampa(){
        echo $this->maiuscolo($this->date);
    }

    
}