package com.upgrad.greeting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService {
    private TimeService timeService;

    @Autowired
    public EnglishGreetingService(TimeService timeService) {
        this.timeService = timeService;
    }

    @Override
    public void greet(String name) {
        int time = timeService.getCurrentTime();
        String greetingMessage;
        if (time < 12) {
            greetingMessage = "Good Morning";
        } else if (time < 17) {
            greetingMessage = "Good Afternoon";
        } else {
            greetingMessage = "Good Evening";
        }
        System.out.println(greetingMessage + ", " + name);
    }
}
