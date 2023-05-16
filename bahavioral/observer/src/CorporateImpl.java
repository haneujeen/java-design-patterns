import java.util.ArrayList;
import java.util.List;

public class CorporateImpl implements Corporate {
    private List<FinancialObserver> observers;
    private boolean stockStatus;
    private boolean financialStatus;

    public CorporateImpl() {
        observers = new ArrayList<>();
        stockStatus = false;
        financialStatus = false;
    }

    @Override
    public void registerObserver(FinancialObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(FinancialObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (FinancialObserver observer : observers) {
            observer.update(stockStatus, financialStatus);
        }
    }

    public void setStockStatus(boolean stockStatus) {
        this.stockStatus = stockStatus;
        notifyObservers();
    }

    public void setFinancialStatus(boolean financialStatus) {
        this.financialStatus = financialStatus;
        notifyObservers();
    }
}
