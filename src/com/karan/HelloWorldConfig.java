package com.karan;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:helloworld.properties")
public class HelloWorldConfig {


    @Bean
    public Choclate choclate(){

        return new Choclate();
    }

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld(choclate());
    }

}
