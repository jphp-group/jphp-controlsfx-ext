<?php


namespace develnext\bundle\controlsfx\formats\tags;


use ide\formats\form\AbstractFormElementTag;
use php\gui\controlsfx\UXRangeSlider;
use php\xml\DomElement;

class RangeSliderFormElementTag extends AbstractFormElementTag{
    public function getTagName()
    {
        return 'org.controlsfx.control.RangeSlider';
    }
    public function getElementClass()
    {
        return UXRangeSlider::class;
    }
    public function writeAttributes($node, DomElement $element)
    {
        /** @var UXRangeSlider $node */
        $element->setAttribute('orientation', $node->orientation);

        $element->setAttribute('min', $node->min);
        $element->setAttribute('max', $node->max);
        $element->setAttribute('blockIncrement', $node->blockIncrement);

        $element->setAttribute('majorTickUnit', (double) $node->majorTickUnit);
        $element->setAttribute('minorTickCount', $node->minorTickCount);

        $element->setAttribute('lowValue', (double) $node->lowValue);
        $element->setAttribute('highValue', (double) $node->highValue);

        $element->setAttribute('showTickLabels', $node->showTickLabels ? 'true' : 'false');
        $element->setAttribute('showTickMarks', $node->showTickMarks ? 'true' : 'false');
        $element->setAttribute('snapToTicks', $node->snapToTicks ? 'true' : 'false');

        $element->setAttribute('lowValueChanging', $node->lowValueChanging ? 'true' : 'false');
        $element->setAttribute('highValueChanging', $node->highValueChanging ? 'true' : 'false');
    }
}