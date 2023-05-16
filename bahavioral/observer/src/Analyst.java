public class Analyst implements FinancialObserver {
    @Override
    public void update(boolean stockStatus, boolean financialStatus) {
        if (stockStatus && financialStatus) {
            recommendBuy();
        } else {
            stayCautious();
        }
    }

    private void recommendBuy() {
        System.out.println("The stock and financial status are both true, the Analyst observer recommends buying.");
    }

    private void stayCautious() {
        System.out.println("Either or both of them are false, the Analyst observer advises staying cautious.");
    }
}
