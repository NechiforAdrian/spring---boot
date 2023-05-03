package ro.itschool.springboot.exceptions;

public class UserCreateException extends RuntimeException {

    public UserCreateException(String message) {
        super(message);
    }
}
