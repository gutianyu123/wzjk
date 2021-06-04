package com.wzjk.utils;


import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2 //开启在线接口文档
public class SwaggerConfig {

    @Bean
    public Docket controllerApi() {
        return new Docket( DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder ()
                        .title("物正健康API")//标题
                        .description("主要包括：物正健康相关接口")//描述
                        .contact(new Contact ("gty", "", ""))
                        .version("1.0.0")//版本号
                        .build())
                .select()
                .apis( RequestHandlerSelectors.basePackage("com.wzjk"))//配置扫描的控制器类包
                //.paths(paths())//配置符合指定规则的路径接口才生成在线接口，用于定制那些接口在ui中展示
                .build();
    }

    @SuppressWarnings("unchecked")
    private Predicate<String> paths() {
        return or(regex("^.*(get|user|parent|thirdpartyauth).*$"));
    }
}
