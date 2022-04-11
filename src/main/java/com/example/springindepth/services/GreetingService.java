package com.example.springindepth.services;

import com.example.springindepth.aspects.Countable;
import com.example.springindepth.aspects.Loggable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${app.greeting}")
    private String greeting;


    public GreetingService() {
        super();
    }

    @Loggable
    @Countable
    public String getGreeting(String name){
        return greeting+ " "+name;
    }
}
