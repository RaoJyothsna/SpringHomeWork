package com.upgrad.greeting;

import com.upgrad.greeting.services.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.upgrad.greeting");
        GreetingService greetingService = (GreetingService)context.getBean("englishGreetingService");

        greetingService.greet("Jyothsna");
        
        //time service
        TimeService timeService = (TimeService) context.getBean("timeService24HourFormat");
        System.out.println("Current Time In 24Hr Format : "+timeService.getCurrentTime());
    }
}
