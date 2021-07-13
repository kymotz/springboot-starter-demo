package com.elltor.demo.conf;

import com.elltor.demo.service.MyJsonService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MyJsonService.class)
@EnableConfigurationProperties(MyJsonProperties.class)
public class MyJsonAutoConfiguration {
    private MyJsonProperties myJsonProperties;

    // 构造器注入
    public MyJsonAutoConfiguration(MyJsonProperties myJsonProperties){
        this.myJsonProperties = myJsonProperties;
    }

    // 自动配置
    @Bean
    // 条件判读，当不存在MyJsonService时创建该Bean
    @ConditionalOnMissingBean(MyJsonService.class)
    public MyJsonService myJsonService(){
        MyJsonService myJsonService = new MyJsonService();
        myJsonService.setPrefixName(myJsonProperties.getPrefixName());
        myJsonService.setSuffixName(myJsonProperties.getSuffixName());
        return myJsonService;
    }

}

