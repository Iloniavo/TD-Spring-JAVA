package com.example.helloworld;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller"})
public class HelloWorld2Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld2Application.class, args);
    }

}
