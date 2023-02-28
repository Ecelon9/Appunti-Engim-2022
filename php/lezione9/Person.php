<?php

class Person {

    private $name;
    private $age;

    public function __construct(string $name = "", int $age = 0) {
        $this->name = $name;
        $this->age = $age;
        
    }

    public function getName() {
        return $this->name;
    }

    public function setName(string $name) {
        $this->name = $name;

    }

    public function setAge(int $age) {
        $this->age = $age;
    }

    public function getData() {
        return "nome: " . $this->name . "<br>anni: " . $this->age;
    }




}

?>