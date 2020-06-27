package com.lwl.rabbitmaq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class RabbitmaqApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmaqApplication.class, args);
    }

}
