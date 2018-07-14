<?php
namespace php\gui\controlsfx;

use php\gui\UXControl;
use php\gui\UXNode;
use php\gui\UXList;

class UXStatusBar extends UXControl{
    /**
     * @var string
    */
    public $text;
    /**
     * @var double
    */
    public $progress;
    /**
     * @var UXNode
    */
    public $graphic;
    /**
     * @var UXList of Node
    */
    public $leftItems;
    /**
     * @var UXList of Node
    */
    public $rightItems;
    /**
     * @var string
    */
    public $styleText;

}