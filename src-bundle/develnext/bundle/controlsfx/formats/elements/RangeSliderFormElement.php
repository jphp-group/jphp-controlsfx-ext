<?php


namespace develnext\bundle\controlsfx\formats\elements;


use ide\formats\form\AbstractFormElement;
use ide\formats\form\elements\LabeledFormElement;
use php\gui\controlsfx\UXPlusMinusSlider;
use php\gui\controlsfx\UXRangeSlider;
use php\gui\controlsfx\UXToggleSwitch;
use php\gui\UXNode;

class RangeSliderFormElement extends AbstractFormElement
{
    public function getGroup(){
        return 'ControlsFX';
    }

    public function getName(){
        return 'Слайдер с диапазоном';
    }

    public function getElementClass(){
        return UXRangeSlider::class;
    }

    public function isOrigin($any){
        return $any instanceof UXRangeSlider;
    }

    public function getIcon(){
        return 'develnext/bundle/controlsfx/icons/rangeSlider16.png';
    }

    public function getIdPattern(){
        return 'rangeSlider%s';
    }

    /**
     * @return UXNode
     */
    public function createElement(){
        return new UXRangeSlider();
    }
}