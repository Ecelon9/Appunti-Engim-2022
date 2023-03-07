<?php

require_once "interface.Openable.php";

class Door implements Openable {
    private $isLocked;

    public function __construct($isLocked = false) {
        $this->isLocked = $isLocked;

    }

    public function open() {
        if ($this->isLocked) {
            echo "The door is locked.";

        } else {
            echo "creeeak.....";
        }
    }

    public function close() {
        if ($this->isLocked) {
            echo "The door already closed.";

        } else {
            $this->open();
            echo "Slam!";

        }

    }
}



?>