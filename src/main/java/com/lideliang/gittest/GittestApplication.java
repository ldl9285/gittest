package com.lideliang.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GittestApplication {

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.setUsername("测试类");
        t.setPassword("admin");
        SpringApplication.run(GittestApplication.class, args);
    }

}
