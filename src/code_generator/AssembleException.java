package code_generator;

public class AssembleException extends Exception{
    public AssembleException( String msg, Exception innerException ) {
        super(msg, innerException);
    }
}
