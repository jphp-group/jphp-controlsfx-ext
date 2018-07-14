<?php
namespace php\gui\controlsfx;

use php\gui\UXControl;
use php\gui\UXNode;

class UXNotificationPane extends UXControl{
    /**
     * @var string
    */
    public $text;
    /**
     * @var UXNode
    */
    public $content;
    /**
     * @var UXNode
    */
    public $graphic;
    /**
     * @var boolean
    */
    public $showing;
    /**
     * @var boolean
    */
    public $showFromTop;
    /**
     * @var boolean
    */
    public $closeButtonVisible;


    public function showNotification(){
        
    }
    public function hideNotification(){
        
    }
}