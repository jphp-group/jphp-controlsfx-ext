<?php


namespace develnext\bundle\controlsfx\formats\elements;


use ide\formats\form\elements\LabeledFormElement;
use php\gui\controlsfx\UXToggleSwitch;
use php\gui\UXNode;

class ToggleSwitchFormElement extends LabeledFormElement
{
    public function getGroup(){
        return 'ControlsFX';
    }

    public function getName(){
        return 'Переключатель';
    }

    public function getElementClass(){
        return UXToggleSwitch::class;
    }

    public function isOrigin($any){
        return $any instanceof UXToggleSwitch;
    }

    public function getIcon(){
        return 'icons/toggleButton16.png';
    }

    public function getIdPattern(){
        return 'toggleSwitch%s';
    }

    /**
     * @return UXNode
     */
    public function createElement(){
        return new UXToggleSwitch();
    }
}