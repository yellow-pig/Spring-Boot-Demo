package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
        //运行之后在浏览器中访问：http://localhost:8080/aello
    }
}