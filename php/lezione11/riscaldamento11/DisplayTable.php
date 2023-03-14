<?php 

require_once "DisplayItemsInterface.php";

class DisplayTable implements DisplayItemsInterface {

    private $items;

    public function set($items) {
        $this->items = $items;

    }

    public function display(){
        $html = "<table>";

        foreach ($this->items as $row) {
            $html .= "<tr>";

            foreach ($row as $col) {
                $html .= "<td>" . $col . "</td>";
            }
            $html .= "</tr>";
        }
        $html .= "</table>";

    return $html;

    }
}


?>