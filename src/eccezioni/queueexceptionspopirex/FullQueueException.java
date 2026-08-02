package eccezioni.queueexceptionspopirex;

public  class FullQueueException extends RuntimeException {

    public FullQueueException(String msg){
        super(msg);
    }
    
}
