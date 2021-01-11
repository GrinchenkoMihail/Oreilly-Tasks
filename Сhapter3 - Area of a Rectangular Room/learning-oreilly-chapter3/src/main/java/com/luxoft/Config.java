package com.luxoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luxoft")
public class Config {

    @Bean
    AreaOfTheRoom areaOfTheRoom() {
        return new AreaOfTheRoom(15, 13);
    }

}
