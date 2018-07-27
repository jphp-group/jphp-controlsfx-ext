<?php


namespace develnext\bundle\controlsfx\formats\tags;


use ide\formats\form\AbstractFormElementTag;
use php\gui\controlsfx\UXCustomPasswordField;
use php\gui\controlsfx\UXCustomTextField;
use php\gui\controlsfx\UXToggleSwitch;
use php\xml\DomElement;

class CustomPasswordFieldFormElementTag extends AbstractFormElementTag{
    public function getTagName()
    {
        return 'org.controlsfx.control.textfield.CustomPasswordField';
    }
    public function getElementClass()
    {
        return UXCustomPasswordField::class;
    }
    public function writeAttributes($node, DomElement $element){

    }
}