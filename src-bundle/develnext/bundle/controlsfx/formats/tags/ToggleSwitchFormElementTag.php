<?php


namespace develnext\bundle\controlsfx\formats\tags;


use ide\formats\form\AbstractFormElementTag;
use php\gui\controlsfx\UXToggleSwitch;
use php\xml\DomElement;

class ToggleSwitchFormElementTag extends AbstractFormElementTag{
    public function getTagName()
    {
        return 'org.controlsfx.control.ToggleSwitch';
    }
    public function getElementClass()
    {
        return UXToggleSwitch::class;
    }
    public function writeAttributes($node, DomElement $element)
    {
        /** @var UXToggleSwitch $node $node */
        $element->setAttribute("selected", $node->selected ? "true" : "false");
    }
}