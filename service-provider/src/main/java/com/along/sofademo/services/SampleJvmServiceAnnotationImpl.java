package com.along.sofademo.services;

import com.alipay.sofa.runtime.api.annotation.SofaService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-06 09:56
 */
@SofaService(uniqueId = "annotationImpl")
public class SampleJvmServiceAnnotationImpl implements SampleJvmService {
    @Override
    public String message() {
        String message = "Hello, jvm service annotation implementation.";
        return message;
    }
}
