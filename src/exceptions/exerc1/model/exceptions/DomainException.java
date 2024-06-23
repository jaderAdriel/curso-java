package exceptions.exerc1.model.exceptions;
import java.lang.Exception;
public class DomainException extends Exception{
    private static final long serialVersionUID = 1L;

    public DomainException(String message){
        super(message);
    }
}
