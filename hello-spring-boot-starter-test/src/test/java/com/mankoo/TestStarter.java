package com.mankoo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import service.HelloService;

@SpringBootTest
public class TestStarter {

    @Autowired
    HelloService helloService;

    @Test
    void test(){

        System.out.println("!!!!!" + helloService.hello()); // 注释，这个是注释by  merge
    }
}
