package com.example.super_kassa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperKassaApplication {


    public static void main(String[] args) {
        try {
            SpringApplication.run(SuperKassaApplication.class, args);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
