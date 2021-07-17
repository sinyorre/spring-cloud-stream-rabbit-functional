package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class MyProcessorService {
    @Bean
    public Function<String, String> convertToUppercase() {
        return (value) -> {
            System.out.println("Message: " + value);
            String upperCaseValue = value.toUpperCase();
            return upperCaseValue;
        };
    }
}
