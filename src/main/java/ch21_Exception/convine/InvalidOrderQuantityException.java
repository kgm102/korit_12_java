package ch21_Exception.convine;

public class InvalidOrderQuantityException extends Exception{
    public InvalidOrderQuantityException(String message){
        super(message);
    }
}
