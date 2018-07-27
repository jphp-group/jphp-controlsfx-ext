<?php

namespace develnext\bundle\controlsfx;

use ide\bundle\AbstractBundle;
use ide\bundle\AbstractJarBundle;
use ide\formats\GuiFormFormat;
use ide\Ide;
use ide\library\IdeLibraryBundleResource;
use ide\project\Project;
use php\desktop\Runtime;
use php\io\File;
use php\lib\fs;

class ControlsFXBundle extends AbstractJarBundle
{
    function onAdd(Project $project, AbstractBundle $owner = null){
        parent::onAdd($project, $owner);

        /** @var GuiFormFormat $format */
        $format = Ide::get()->getRegisteredFormat(GuiFormFormat::class);
        if($format){
            $format->registerInternalList('.dn/bundle/controlsfx/formComponents');
        }
    }
    function onRemove(Project $project, AbstractBundle $owner = null){
        parent::onRemove($project, $owner);

        /** @var GuiFormFormat $format */
        $format = Ide::get()->getRegisteredFormat(GuiFormFormat::class);
        if($format){
            $format->unregisterInternalList('.dn/bundle/controlsfx/formComponents');
        }
    }

    public function onRegister(IdeLibraryBundleResource $resource)
    {
        parent::onRegister($resource);
        fs::scan($resource->getPath(), function(File $file){
            Runtime::addJar($file);
        });
    }
}