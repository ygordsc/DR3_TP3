package br.infnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class Dr3Tp3Application {

    public static void main(String[] args) {
        SpringApplication.run(Dr3Tp3Application.class, args);
    }

}