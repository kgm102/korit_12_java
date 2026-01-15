package ch21_Exception.signup;

public class InvalidIdException extends Exception{
    public InvalidIdException(String message){
        super(message);
    }
}
