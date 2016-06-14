package ChainOfResponsability;

/**
 * Created by victoraweb on 6/12/16.
 */
public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("Great! VPs can approve purchases below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}
