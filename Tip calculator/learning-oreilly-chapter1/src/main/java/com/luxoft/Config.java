package com.luxoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luxoft")
public class Config {

    @Bean
    CalculatorTips calculatorTips(){
        return new CalculatorTips(44,8);
    }

}
