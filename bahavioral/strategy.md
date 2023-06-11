Strategy software design pattern is a behavioral design pattern that turns a set of behaviors into objects 
and makes them interchangeable inside context object. The algorithm varies independently 
as the client sets the strategy through the context.
```agsl
interface SortStrategy {
    void sort(Integer[] numbers);
}
```
```agsl
class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(Integer[] numbers) {
        // Implementation of Bubble Sort algorithm
    }
}

class QuickSortStrategy implements SortStrategy {
    @Override
    public void sort(Integer[] numbers) {
        // Implementation of Quick Sort algorithm
    }
}
```
```agsl
class Context {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Integer[] numbers) {
        strategy.sort(numbers);
    }
}
```
```agsl
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        Integer[] numbers = {4, 2, 8, 1, 3, 7, 6, 5};

        context.setStrategy(new BubbleSortStrategy());
        context.executeStrategy(numbers);

        context.setStrategy(new QuickSortStrategy());
        context.executeStrategy(numbers);
    }
}
```