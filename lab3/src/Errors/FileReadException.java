package Errors;

public class FileReadException extends Throwable{

    public FileReadException(String reason){
        super(reason);
    }
}
