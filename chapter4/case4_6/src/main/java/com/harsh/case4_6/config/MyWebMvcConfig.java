package com.harsh.case4_6.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/book/**") //表示对哪种格式的请求路径进行跨域处理
                .allowedHeaders("*") // 表示允许的请求头，默认允许所有的请求头信息
                .allowedMethods("*") // 表示允许的请求方法，默认是GET、POST和HEAD;*表示支持所有的请求方法
                .maxAge(1800) // maxAge表示探测请求的有效期
                .allowedOrigins("http://localhost:8081/"); // 表示支持的域
    }
}
