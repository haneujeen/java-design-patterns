public interface Corporate {
    void registerObserver(FinancialObserver observer);
    void removeObserver(FinancialObserver observer);
    void notifyObservers();
}
