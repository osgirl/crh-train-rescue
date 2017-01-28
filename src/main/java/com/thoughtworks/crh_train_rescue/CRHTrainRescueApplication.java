package com.thoughtworks.crh_train_rescue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CRHTrainRescueApplication {
    public static void main(String[] args) {
        SpringApplication.run(CRHTrainRescueApplication.class, args);
    }
}
