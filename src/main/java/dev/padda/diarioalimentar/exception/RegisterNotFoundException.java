package dev.padda.diarioalimentar.exception;

public class RegisterNotFoundException extends RuntimeException{
    public RegisterNotFoundException(String message){
        super(message);
    }
}
