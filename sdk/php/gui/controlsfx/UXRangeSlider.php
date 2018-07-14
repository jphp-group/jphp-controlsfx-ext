<?php
namespace php\gui\controlsfx;

use php\gui\UXControl;

class UXRangeSlider extends UXControl{
    /**
     * @var double
    */
    public $min;
    /**
     * @var double
    */
    public $max;
    /**
     * @var string
     * HORIZONTAL, VERTICAL
    */
    public $orientation;
    /**
     * @var boolean
    */
    public $showTickLabels;
    /**
     * @var boolean
    */
    public $showTickMarks;
    /**
     * @var double
    */
    public $majorTickUnit;
    /**
     * @var int
    */
    public $minorTickCount;
    /**
     * @var boolean
    */
    public $snapToTicks;
    /**
     * @var double
    */
    public $blockIncrement;
    /**
     * @var double
    */
    public $lowValue;
    /**
     * @var boolean
    */
    public $lowValueChanging;
    /**
     * @var double
    */
    public $highValue;
    /**
     * @var boolean
    */
    public $highValueChanging;

}