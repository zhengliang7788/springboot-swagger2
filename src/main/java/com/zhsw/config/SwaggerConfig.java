package com.zhsw.config;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: zhengliang
 * @Description: swagger配置
 * @Date: 2019/12/29 15:11
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //类上有api注解生成文档
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                //方法上有apiOperation生成文档
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("springboot-swagger2")
                .description("springboot整合swagger2接口文档")
                .contact(new Contact("翔亦"
                        ,"https://github.com/zhengliang961116/springboot-swagger2"
                        ,"zhengliang961116@163.com"))
                .version("1.0.0")
                .build();


    }
}
