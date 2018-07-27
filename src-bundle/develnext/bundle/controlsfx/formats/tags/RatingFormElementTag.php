<?php


namespace develnext\bundle\controlsfx\formats\tags;


use ide\formats\form\AbstractFormElementTag;
use php\gui\controlsfx\UXRangeSlider;
use php\gui\controlsfx\UXRating;
use php\xml\DomElement;

class RatingFormElementTag extends AbstractFormElementTag{
    public function getTagName()
    {
        return 'org.controlsfx.control.Rating';
    }
    public function getElementClass()
    {
        return UXRating::class;
    }
    public function writeAttributes($node, DomElement $element)
    {
        /** @var UXRating $node */
        $element->setAttribute('orientation', $node->orientation);

        $element->setAttribute('max', $node->max);
        $element->setAttribute('rating', $node->max);

        $element->setAttribute('partialRating', $node->partialRating ? 'true' : 'false');
        $element->setAttribute('updateOnHover', $node->updateOnHover ? 'true' : 'false');
    }
}