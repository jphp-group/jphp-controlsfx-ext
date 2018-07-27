<?php


namespace develnext\bundle\controlsfx\formats\elements;


use ide\formats\form\elements\LabeledFormElement;
use ide\formats\form\elements\TextFieldFormElement;
use ide\Ide;
use ide\systems\Cache;
use php\gui\controlsfx\UXCustomPasswordField;
use php\gui\controlsfx\UXCustomTextField;
use php\gui\controlsfx\UXToggleSwitch;
use php\gui\event\UXDragEvent;
use php\gui\framework\DataUtils;
use php\gui\UXDragboard;
use php\gui\UXImageView;
use php\gui\UXLabeled;
use php\gui\UXNode;
use php\lib\fs;

class CustomPasswordFieldFormElement extends CustomTextFieldFormElement
{
    public function getName(){
        return 'Расширенное поле для пароля';
    }

    public function getElementClass(){
        return UXCustomPasswordField::class;
    }

    public function isOrigin($any){
        return $any instanceof UXCustomPasswordField;
    }

    public function getIcon(){
        return 'icons/passwordField16.png';
    }

    public function getIdPattern(){
        return 'passwordField%s';
    }


//    public function getIdPattern(){
//        return 'edit%s';
//    }

    /**
     * @return UXNode
     */
    public function createElement(){
        return new UXCustomPasswordField();
    }
}