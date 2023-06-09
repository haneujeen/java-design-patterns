/**
 * This is an example for use of the Template Method Pattern generated by ChatGPT.
 *
 * Subclasses (cakes) redefine steps in the base algorithm (template method, `bakeCake` in this case)
 * without changing the skeleton of the algorithm.
 */
public class Main {
    public static void main(String[] args) {
        Cake chocolateCake = new ChocolateCake();
        chocolateCake.bakeCake();

        System.out.println();

        Cake carrotCake = new CarrotCake();
        carrotCake.bakeCake();
    }
}