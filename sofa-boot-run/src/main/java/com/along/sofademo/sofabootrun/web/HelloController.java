package com.along.sofademo.sofabootrun.web;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.along.sofademo.services.SampleJvmService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-05 20:35
 */
@RestController
public class HelloController {

    @SofaReference(uniqueId = "annotationImpl")
    private SampleJvmService sampleJvmServiceAnnotationImpl;

    @RequestMapping("/hello")
    public String hello() throws IOException {
        return sampleJvmServiceAnnotationImpl.message();
    }
}