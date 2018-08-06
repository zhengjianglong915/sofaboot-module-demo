package com.along.sofademo.samples;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.aware.ClientFactoryAware;
import com.alipay.sofa.runtime.api.client.ClientFactory;
import com.alipay.sofa.runtime.api.client.ReferenceClient;
import com.alipay.sofa.runtime.api.client.param.ReferenceParam;
import com.along.sofademo.services.SampleJvmService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-06 10:06
 */
public class JvmServiceConsumer implements ClientFactoryAware {

    @SofaReference(uniqueId = "annotationImpl")
    private SampleJvmService sampleJvmServiceAnnotationImpl;

    @SofaReference(uniqueId = "sampleJvmService")
    private SampleJvmService sampleJvmService;

    private ClientFactory clientFactory;

    public void init() {
        ReferenceClient referenceClient = clientFactory.getClient(ReferenceClient.class);
        ReferenceParam<SampleJvmService> referenceParam = new ReferenceParam<>();
        referenceParam.setInterfaceType(SampleJvmService.class);
        referenceParam.setUniqueId("serviceClientImpl");
        SampleJvmService sampleJvmServiceClientImpl = referenceClient.reference(referenceParam);
        String message = sampleJvmServiceClientImpl.message();
        System.out.println(message);

        message = sampleJvmServiceAnnotationImpl.message();
        System.out.println(message);

        // 这个为什么一直找不到
        message = sampleJvmService.message();
        System.out.println(message);
    }

    @Override
    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public String message() {
        return sampleJvmServiceAnnotationImpl.message();
    }
}

