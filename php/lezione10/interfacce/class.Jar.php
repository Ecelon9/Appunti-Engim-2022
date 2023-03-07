<?php

require_once "interface.Openable.php";

class Jar implements Openable {
    private $content;

    public function __construct(string $content = "fruit") {
        $this->content = $content;

    }

    public function open() {
        echo "The jar is open.<br>";
        echo "There is some " . $this->content . " inside.";

    }

    public function close() {
        echo "The jar is closed.";

    }


}


?>