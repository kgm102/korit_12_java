package ch21_Exception.scores;

public class InvalidScoreException extends Exception{
    public InvalidScoreException(String message){
        super(message);
    }
}
