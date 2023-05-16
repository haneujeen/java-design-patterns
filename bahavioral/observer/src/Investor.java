public class Investor implements FinancialObserver {
    @Override
    public void update(boolean stockStatus, boolean financialStatus) {
        if (financialStatus) {
            investMore();
        } else {
            considerWithdrawal();
        }
    }

    private void investMore() {
        System.out.println("The financial status is true, the Investor observer invests more.");
    }

    private void considerWithdrawal() {
        System.out.println("The financial status is false, the Investor observer considers selling stocks.");
    }
}
