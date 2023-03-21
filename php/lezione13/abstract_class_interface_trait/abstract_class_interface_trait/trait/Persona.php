<?php

require_once 'Utility.php';

class Persona{
    use Utility;

    private $string='';
    public function __construct($string){
        $this->string=$string;
    }

    public function stampa(){
        echo $this->maiuscolo($this->string);
    }

    
}