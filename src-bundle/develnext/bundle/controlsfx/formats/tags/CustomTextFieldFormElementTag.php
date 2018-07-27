<?php


namespace develnext\bundle\controlsfx\formats\tags;


use ide\formats\form\AbstractFormElementTag;
use php\gui\controlsfx\UXCustomTextField;
use php\gui\controlsfx\UXToggleSwitch;
use php\xml\DomElement;

class CustomTextFieldFormElementTag extends AbstractFormElementTag{
    public function getTagName()
    {
        return 'org.controlsfx.control.textfield.CustomTextField';
    }
    public function getElementClass()
    {
        return UXCustomTextField::class;
    }
    public function writeAttributes($node, DomElement $element)
    {

    }
}