package com.harsh.case2_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @ComponentScan // 启动包扫描
// @EnableAutoConfiguration // 开启自动化配置
@SpringBootApplication
public class Case23Application {

    /**
     * App.class： 告诉Spring哪个是主要组件
     * args：运行时输入的其他参数
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Case23Application.class, args);
    }

}
