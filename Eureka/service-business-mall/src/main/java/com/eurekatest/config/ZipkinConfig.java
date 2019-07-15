/*
 * module: service-business-mall
 * file: ZipkinConfig
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.config;

import org.springframework.context.annotation.Configuration;

/**
 * @des:
 * @author:
 * @date:
 * @modify:
 * @date:
 */
@Configuration
public class ZipkinConfig {
    //span（一次请求信息或者一次链路调用）信息收集
    /*@Bean
    public SpanCollector spanCollector() {
        Config config = HttpSpanCollector.Config.builder()
                .compressionEnabled(false)// 默认false，span在transport之前是否会被gzipped
                .connectTimeout(5000)
                .flushInterval(1)
                .readTimeout(6000)
                .build();
        return HttpSpanCollector.create("http://localhost:9411", config, new EmptySpanCollectorMetricsHandler());
    }

    //作为各调用链路，只需要负责将指定格式的数据发送给zipkin
    @Bean
    public Brave brave(SpanCollector spanCollector){
        Builder builder = new Builder("service1");//指定serviceName
        builder.spanCollector(spanCollector);
        builder.traceSampler(Sampler.create(1));//采集率
        return builder.build();
    }


    //设置server的（服务端收到请求和服务端完成处理，并将结果发送给客户端）过滤器
    @Bean
    public BraveServletFilter braveServletFilter(Brave brave) {
        BraveServletFilter filter = new BraveServletFilter(brave.serverRequestInterceptor(),
                                                           brave.serverResponseInterceptor(), new DefaultSpanNameProvider());
        return filter;
    }

    //设置client的（发起请求和获取到服务端返回信息）拦截器
    @Bean
    public OkHttpClient okHttpClient(Brave brave){
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new BraveOkHttpRequestResponseInterceptor(
                        brave.clientRequestInterceptor(),
                        brave.clientResponseInterceptor(),
                        new DefaultSpanNameProvider())).build();
        return httpClient;
    }*/
}
