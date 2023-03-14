<?php 

require_once "DisplayItemsInterface.php";

class DisplayList implements DisplayItemsInterface {
    private $items;

    public function set($items) {
        $this->items = $items;

    }

    public function display(){
        $html = "<ol>";

        foreach ($this->items as $item) {
            $html .= "<li>" . $item . "</li>";

        }
        $html .= "</ol>";


    return $html;

    }
}

?>