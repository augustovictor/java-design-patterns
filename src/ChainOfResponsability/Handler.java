package ChainOfResponsability;

/**
 * Created by victoraweb on 6/12/16.
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    public abstract void handleRequest(Request request);
}
