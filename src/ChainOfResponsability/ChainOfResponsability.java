package ChainOfResponsability;

/**
 * Created by victoraweb on 6/12/16.
 */
public class ChainOfResponsability {
    public static void main(String[] args) {

        Director victor = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        victor.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        victor.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        victor.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        victor.handleRequest(request);
    }
}
