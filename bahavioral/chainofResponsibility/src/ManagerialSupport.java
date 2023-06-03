public class ManagerialSupport implements SupportService {
    private SupportService next;

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() == SupportRequestType.MANAGERIAL) {
            System.out.println("Managerial Support handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }

    @Override
    public void setNext(SupportService next) {
        this.next = next;
    }
}