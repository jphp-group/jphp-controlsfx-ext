<?php
namespace php\gui\controlsfx;

use php\gui\UXControl;
use php\gui\UXNode;

class UXHiddenSidesPane extends UXControl{
    /**
     * @var UXNode
    */
    public $top;
    /**
     * @var UXNode
    */
    public $left;
    /**
     * @var UXNode
    */
    public $right;
    /**
     * @var 
    */
    public $content;
    /**
     * @var UXNode
    */
    public $bottom;
    /**
     * @var double
    */
    public $triggerDistance;
    /**
     * @var int
    */
    public $animationDelay;
    /**
     * @var int
    */
    public $animationDuration;

}