package ro.itschool.springboot.beantest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.itschool.springboot.Application;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        String greeting = greetingService.getGreetingMessage();
        System.out.println(greeting);
    }
}
