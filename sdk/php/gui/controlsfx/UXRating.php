<?php
namespace php\gui\controlsfx;

use php\gui\UXControl;

class UXRating extends UXControl{
    /**
     * @var int
    */
    public $max;
    /**
     * @var string
     * HORIZONTAL, VERTICAL
    */
    public $orientation;
    /**
     * @var double
    */
    public $rating;
    /**
     * @var boolean
    */
    public $partialRating;
    /**
     * @var boolean
    */
    public $updateOnHover;

}