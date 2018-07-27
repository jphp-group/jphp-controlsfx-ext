<?php


namespace develnext\bundle\controlsfx\formats\tags;


use ide\formats\form\AbstractFormElementTag;
use php\gui\controlsfx\UXPlusMinusSlider;
use php\gui\controlsfx\UXToggleSwitch;
use php\xml\DomElement;

class PlusMinusSliderFormElementTag extends AbstractFormElementTag{
    public function getTagName()
    {
        return 'org.controlsfx.control.PlusMinusSlider';
    }
    public function getElementClass()
    {
        return UXPlusMinusSlider::class;
    }
    public function writeAttributes($node, DomElement $element)
    {
        /** @var UXPlusMinusSlider $node */
        $element->setAttribute('orientation', $node->orientation);
    }
}