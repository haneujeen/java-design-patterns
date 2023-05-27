public interface SupportService {
    void handleRequest(SupportRequest request);
    void setNext(SupportService nextInChain);
}