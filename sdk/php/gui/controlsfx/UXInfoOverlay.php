<?php
namespace php\gui\controlsfx;

use php\gui\UXControl;
use php\gui\UXNode;

class UXInfoOverlay extends UXControl{
    /**
     * @var string
    */
    public $text;
    /**
     * @var UXNode
    */
    public $content;
    /**
     * @var boolean
    */
    public $showOnHover;

}