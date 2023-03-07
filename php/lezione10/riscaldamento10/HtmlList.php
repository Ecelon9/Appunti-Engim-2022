<?php

class HtmlList{

    private $html = "<pre>";
    private $listType;
    private $order;
    private array $list;

    public function __construct($list) {
        $this->list = $list;

    }

    public function getHtmlList() {
        $this->html .= $this->listType[0];

        for ($i = 0; $i < count($this->list); $i++) {
            $this->html .= "<li>" . $this->list[$i] . "</li>";

        }
        $this->html .= $this->listType[1];

        return $this->html;

    }

    public function setType($string = "ordinata") {
        if ($string == "ordinata") {
            $this->listType = ["<ol>" , "</ol>"];
            var_dump($this->listType);

        } else {
            $this->listType = ["<ul>" , "</ul>"];
            var_dump($this->listType);
        }
    }

    public function setOrder() {
        if ($this->order == "asc") {

        }

    }



}


?>