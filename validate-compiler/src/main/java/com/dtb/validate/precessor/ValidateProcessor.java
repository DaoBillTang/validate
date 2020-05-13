package com.dtb.validate.precessor;

import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;

@AutoService(Processor.class)
@SupportedAnnotationTypes({
        "com.dtb.validate.annotation.Validate",
        "com.dtb.validate.annotation.ValidateBean",
        "com.dtb.validate.annotation.ValidateRule"
})
public class ValidateProcessor extends BaseProcessor {


    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        logger.info(">>> ValidateProcessor init. <<<");
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {




        return false;
    }



}
