<?php
namespace php\gui\controlsfx;

use php\gui\UXPopupWindow;
use php\gui\UXNode;

class UXPopOver extends UXPopupWindow{
    /**
     * @var string
    */
    public $title;
    /**
     * @var boolean
    */
    public $detachable;
    /**
     * @var boolean
    */
    public $animated;
    /**
     * @var STRING
     * BOTTOM_CENTER, BOTTOM_LEFT, BOTTOM_RIGHT, LEFT_BOTTOM, LEFT_CENTER, LEFT_TOP, RIGHT_BOTTOM, RIGHT_CENTER, RIGHT_TOP, TOP_CENTER, TOP_LEFT, TOP_RIGHT 
    */
    public $arrowLocation;
    /**
     * @var int
    */
    public $fadeInDuration;
    /**
     * @var int
    */
    public $fadeOutDuration;
    /**
     * @var UXNode
    */
    public $contentNode;
    /**
     * @var boolean
    */
    public $closeButtonEnabled;
    /**
     * @var boolean
    */
    public $detached;
    /**
     * @var double
    */
    public $arrowSize;
    /**
     * @var double
    */
    public $arrowIndent;
    /**
     * @var double
    */
    public $cornerRadius;
    /**
     * @var boolean
    */
    public $headerAlwaysVisible;


    public function hideWithFade(int $duration){
        
    }
}