package com.example;

import com.example.thred.MyThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootClient21Application  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        SpringApplication.run(SpringBootClient21Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootClient21Application.class);
    }

}
