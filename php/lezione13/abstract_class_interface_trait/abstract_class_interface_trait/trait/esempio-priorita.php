<?php

class BaseClass {

    public function sayHello(){
        echo "Hello ";
    }
}

trait SayWorld {
    public function sayHello() {
        parent::sayHello();
        echo "World";


    }
    
}




class CompositeClass extends BaseClass{
    use SayWorld;

}

$o = new CompositeClass();
$o->sayHello();


