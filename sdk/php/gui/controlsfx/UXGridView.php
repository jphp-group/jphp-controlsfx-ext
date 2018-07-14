<?php
namespace php\gui\controlsfx;

use php\gui\UXControl;
use php\gui\UXList;

class UXGridView extends UXControl{
    /**
     * @var UXList
    */
    public $items;
    /**
     * @var double
    */
    public $horizontalCellSpacing;
    /**
     * @var double
    */
    public $verticalCellSpacing;
    /**
     * @var double
    */
    public $cellWidth;
    /**
     * @var double
    */
    public $cellHeight;

    public function setCellFactory(callable $factory){

    }
}