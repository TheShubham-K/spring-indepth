package com.example.springindepth;

import com.example.springindepth.config.ApplicationConfig;
import com.example.springindepth.services.OutputService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringIndepthApplication {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);


/*
        GreetingService greetingService = new GreetingService("Hello");
        TimeService timeService = new TimeService(true);
        OutputService outputService = new OutputService(greetingService, timeService);
*/


        for (int i = 0; i < 5; i++) {
            outputService.generateOutput();
            Thread.sleep(5000);
        }


    }

}
