package ChainOfResponsability;

/**
 * Created by victoraweb on 6/12/16.
 */
public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
