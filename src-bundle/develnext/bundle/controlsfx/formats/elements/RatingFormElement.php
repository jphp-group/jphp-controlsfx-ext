<?php


namespace develnext\bundle\controlsfx\formats\elements;


use ide\formats\form\elements\LabeledFormElement;
use php\gui\controlsfx\UXRating;
use php\gui\controlsfx\UXToggleSwitch;
use php\gui\UXNode;

class RatingFormElement extends LabeledFormElement
{
    public function getGroup(){
        return 'ControlsFX';
    }

    public function getName(){
        return 'Рейтинг';
    }

    public function getElementClass(){
        return UXRating::class;
    }

    public function isOrigin($any){
        return $any instanceof UXRating;
    }

    public function getIcon(){
        return 'develnext/bundle/controlsfx/icons/rating16.png';
    }

    public function getIdPattern(){
        return 'rating%s';
    }

    /**
     * @return UXNode
     */
    public function createElement(){
        return new UXRating();
    }
}