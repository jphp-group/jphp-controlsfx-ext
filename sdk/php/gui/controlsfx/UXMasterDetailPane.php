<?php
namespace php\gui\controlsfx;

use php\gui\UXControl;
use php\gui\UXNode;

class UXMasterDetailPane extends UXControl{
    /**
     * @var boolean
    */
    public $animated;
    /**
     * @var double
    */
    public $dividerSizeHint;
    /**
     * @var string
    */
    public $detailSide;
    /**
     * @var boolean
    */
    public $showDetailNode;
    /**
     * @var UXNode
    */
    public $masterNode;
    /**
     * @var UXNode
    */
    public $detailNode;
    /**
     * @var double
    */
    public $dividerPosition;

}