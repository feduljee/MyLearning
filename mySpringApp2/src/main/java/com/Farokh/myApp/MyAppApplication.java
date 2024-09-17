package com.Farokh.myApp;

import org.springframework.boot.SpringApplication;

@SpringBootApplication

public class MyAppApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run;

        Dev obj = context.getBean(Dev.class);

        obj.build();
    }
}
