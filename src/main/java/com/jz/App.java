package com.jz;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Administrator on 2019/2/26 0026.
 */
@SpringBootApplication
@MapperScan("com.jz.dao")

public class App extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //此处的Application.class为带有@SpringBootApplication注解的启动类
        return builder.sources(App.class);
    }

}
