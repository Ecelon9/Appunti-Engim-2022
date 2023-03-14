<?php 

require_once("DisplayList.php");
require_once("DisplayTable.php");

$data1 = ["cane", "gatto"];
$data2 = [
    ["mela", "rossa"],
    ["banana", "gialla"],
    ["pera", "verde"]
];

function DisplaySomething(DisplayItemsInterface $obj) {
    echo $obj->display();

}

$list = new DisplayList();
$list->set($data1);
DisplaySomething($list);

$table = new DisplayList();
$table->set($data2);
DisplaySomething($table);


?>