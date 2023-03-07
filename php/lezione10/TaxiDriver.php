<?php
require_once("User.php");

class TaxiDriver extends User {
    private string $license;

    public function __construct($name, $license){
        parent::__construct($name); //metodo che richiama tutto il costruttore della classe parente 
        //al quale possiamo passare gli argomenti ricevuti da questo costruttore
        $this->license = $license;

    }

    public function setLicense($license) {
        $this->license = $license;

    }

    public function getData() {
        return $this->name . " " . $this->license;

    }



}





