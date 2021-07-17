package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class MyConsumerService {
    @Bean
    public Consumer<String> onReceive() {
        return (message) -> {
            System.out.println("Uppermessage: " + message);
        };
    }
}
