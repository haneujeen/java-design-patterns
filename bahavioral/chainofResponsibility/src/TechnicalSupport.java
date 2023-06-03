public class TechnicalSupport implements SupportService {
    private SupportService nextInChain;

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() == SupportRequestType.TECHNICAL) {
            System.out.println("Technical Support handled the request.");
        } else if (nextInChain != null) {
            nextInChain.handleRequest(request);
        }
    }

    @Override
    public void setNext(SupportService next) {
        this.nextInChain = next;
    }
}