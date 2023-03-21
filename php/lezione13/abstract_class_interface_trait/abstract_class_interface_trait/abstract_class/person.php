<?php 
abstract class person {

    public $LastName;
    public $FirstName;
    public $BirthDate;

    protected function write_info(){
        // il codice di memorizzazione standard per i dati standard
        echo "Writing ". $this->LastName . "'s info  to people table";
    }
}

final class employee extends person{

    public $EmployeeNumber;
    public $DateHired;

    public function write_info(){
        //il codice di memorizzazione va qui
        echo "Writing ". $this->LastName . "'s info to emloyee dbase table <br>";   
    }
}

final class student extends person{

    public $StudentNumber;
    public $CourseName;

    public function write_info(){
        //il codice di memorizzazione va qui
        echo "Writing ". $this->LastName . "'s info to student dbase table <br>";
    }
}

///----------

$personA = new employee;
$personB = new student;

$personA->FirstName="Joe";
$personA->LastName="Sbody";

$personB->FirstName="Ben";
$personB->LastName="Dover";

$personA->write_info();
// salvo i dati dell'utente secondo quando specificato per gli impiegati (employee)
$personB->write_info();
// salvo i dati dell'utente secondo quanto specificato  per gli studenti (student)
