public class BillingSupport implements SupportService {
    private SupportService next;

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() == SupportRequestType.BILLING) {
            System.out.println("Billing Support handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }

    @Override
    public void setNext(SupportService next) {
        this.next = next;
    }
}