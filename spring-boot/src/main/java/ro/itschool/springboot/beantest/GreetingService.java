package ro.itschool.springboot.beantest;

public class GreetingService {

    private final String message;

    public GreetingService(String message) {
        this.message = message;
    }

    public String getGreetingMessage() {
        return "Greeting message, " + message;
    }
}
