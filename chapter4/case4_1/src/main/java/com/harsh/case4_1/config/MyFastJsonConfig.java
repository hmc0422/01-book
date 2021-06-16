package com.harsh.case4_1.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.Charset;

@Configuration
public class MyFastJsonConfig {

    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setDateFormat("yyyy-MM-dd"); // 日期格式
        config.setCharset(Charset.forName("UTF-8")); // 数据编码
        config.setSerializerFeatures(
                SerializerFeature.WriteClassName, // 是否在生成的JSON中输出类名
                SerializerFeature.WriteMapNullValue, // 是否输出value为null的数据
                SerializerFeature.PrettyFormat, // 生成的JSON格式化
                SerializerFeature.WriteNullListAsEmpty, // 空集合输出[]而非生成null
                SerializerFeature.WriteNullStringAsEmpty // 空字符串输出""而非null
        );
        converter.setFastJsonConfig(config);
        return converter;
    }

}
