<?php


namespace develnext\bundle\controlsfx\formats\elements;


use ide\formats\form\AbstractFormElement;
use ide\formats\form\elements\LabeledFormElement;
use php\gui\controlsfx\UXPlusMinusSlider;
use php\gui\controlsfx\UXToggleSwitch;
use php\gui\UXNode;

class PlusMinusSliderFormElement extends AbstractFormElement
{
    public function getGroup(){
        return 'ControlsFX';
    }

    public function getName(){
        return 'Плюс-минус ползунок';
    }

    public function getElementClass(){
        return UXPlusMinusSlider::class;
    }

    public function isOrigin($any){
        return $any instanceof UXPlusMinusSlider;
    }

    public function getIcon(){
        return 'icons/slider16.png';
    }

    public function getIdPattern(){
        return 'plusMinusSlider%s';
    }

    /**
     * @return UXNode
     */
    public function createElement(){
        return new UXPlusMinusSlider();
    }
}