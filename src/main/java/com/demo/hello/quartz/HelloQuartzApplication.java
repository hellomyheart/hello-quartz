package com.demo.hello.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author syj
 */
@EnableScheduling
@SpringBootApplication
public class HelloQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloQuartzApplication.class, args);
    }

}
