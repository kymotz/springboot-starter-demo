### SpringBoot Starter原理与教程

https://blog.csdn.net/songzehao/article/details/100837463

https://blog.csdn.net/songzehao/article/details/100865939

https://www.jianshu.com/p/ab5254ecb8da

https://blog.csdn.net/weixin_35962223/article/details/109161043


### 步骤

1. 创建配置属性类 XXXProperties，设置注解 `@ConfigurationProperties`
2. 创建自动配置类，注解
  - @Configuration   标志配置
  - @ConditionalXXX  根据一定的条件使配置生效
  - @EnableConfigurationProperties  指定配置属性类
3. 在`resources`中创建`META-INF`，创建 `spring.factories`
4. spring.factories
    ```bash
    org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
    com.elltor.demo.conf.MyJsonAutoConfiguration
    ```
5. 打包（package），将jar安装（install）到本地仓库  