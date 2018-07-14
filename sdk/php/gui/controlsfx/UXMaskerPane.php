<?php
namespace php\gui\controlsfx;

use php\gui\UXControl;
use php\gui\UXNode;

class UXMaskerPane extends UXControl{
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
    public $progressNode;
    /**
     * @var boolean
    */
    public $progressVisible;

}