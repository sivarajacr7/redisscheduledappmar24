package com.payitchi1.carredisapplnapr324;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class Carredisapplnapr324Application {

    public static void main(String[] args) {
        SpringApplication.run(Carredisapplnapr324Application.class, args);
    }

}
