<?php


namespace develnext\bundle\controlsfx\formats\elements;


use ide\formats\form\elements\LabeledFormElement;
use ide\formats\form\elements\TextFieldFormElement;
use ide\Ide;
use ide\systems\Cache;
use php\gui\controlsfx\UXCustomTextField;
use php\gui\controlsfx\UXToggleSwitch;
use php\gui\event\UXDragEvent;
use php\gui\framework\DataUtils;
use php\gui\UXDragboard;
use php\gui\UXImageView;
use php\gui\UXLabeled;
use php\gui\UXNode;
use php\lib\fs;

class CustomTextFieldFormElement extends TextFieldFormElement
{
    public function getGroup(){
        return 'ControlsFX';
    }

    public function getName(){
        return 'Расширенное поле ввода';
    }

    public function getElementClass(){
        return UXCustomTextField::class;
    }

    public function isOrigin($any){
        return $any instanceof UXCustomTextField;
    }

    public function getIcon(){
        return 'icons/textField16.png';
    }
    public function registerNode(UXNode $node)
    {
        parent::registerNode($node);

        /** @var CustomTextFieldFormElement $node */
        $data = DataUtils::get($node);
        $left = $data->get('left');

        $project = Ide::get()->getOpenedProject();
        if(!$project){
            return;
        }

        if($left){
            $file = $project->getFile("src/{$left}");
            if($file->exists()){
                $node->image = Cache::getImage($file);
            }
        }

        $right = $data->get('left');
        if($right){
            $file = $project->getFile("src/{$right}");
            if($file->exists()){
                $node->image = Cache::getImage($file);
            }
        }
    }


//    public function getIdPattern(){
//        return 'edit%s';
//    }

    /**
     * @return UXNode
     */
    public function createElement(){
        return new UXCustomTextField();
    }
}