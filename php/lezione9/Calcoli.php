<?php

class Calcoli{

    private $num1;
    private $num2;

    public function __construct($par1, $par2){
        $this->num1 = $par1;
        $this->num2 = $par2;

    }

    public function __toString() {
        return "Hai inserito i numeri: " . $this->num1 . " " . $this->num2;
    }

    public function massimo(){
        if ($this->num1 > $this->num2) {
            return $this->num1 . " è maggiore";

        } else {
            return $this->num2 . " è maggiore";

        }
    }

    public function minimo(){
        if ($this->num1 < $this->num2) {
            return $this->num1 . " è minore";

        } else {
            return $this->num2 . " è minore";

        }
    }

    public function update($par1, $par2) {
        $this->num1 = $par1;
        $this->num2 = $par2;

    }



}




?>