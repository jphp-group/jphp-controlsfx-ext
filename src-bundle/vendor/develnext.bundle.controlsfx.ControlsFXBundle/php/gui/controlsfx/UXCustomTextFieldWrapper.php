<?php


namespace php\gui\controlsfx;


use php\framework\Logger;
use php\gui\UXData;
use php\gui\UXImage;
use php\gui\UXImageView;
use php\gui\UXNodeWrapper;

class UXCustomTextFieldWrapper extends UXNodeWrapper
{
    public function applyData(UXData $data){
        $this->loadFor('left', $data);
        $this->loadFor('right', $data);
    }
    protected function loadFor(string $side, UXData $data){
        parent::applyData($data);

        if($data->has($side)){
            try{
                $graphic = new UXImageView();
                $graphic->image = new UXImage('res://'.$data->get($side));
                $this->node->{$side} = $graphic;
            }
            catch(\Exception $e){
                Logger::error("Cannot load image for {$side} side: \"".$data->get($side).'", component = '.$this->node->id);
            }
        }
    }
}