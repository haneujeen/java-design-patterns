public class CarrotCake extends Cake {
    CarrotCake() {
        this.ingredients = "2 cups all-purpose flour, 2 cups sugar, 2 teaspoons baking soda, 2 teaspoons ground cinnamon, 1/2 teaspoon salt, 3 eggs, 3/4 cup vegetable oil, 3/4 cup buttermilk, 2 teaspoons vanilla extract, 2 cups grated carrots, 1 cup flaked coconut, 1/2 cup mix of raisins and chopped walnuts";
    }

    @Override
    void bake() {
        System.out.println("Baking the carrot cake at 325 degrees for 45 minutes...");
    }

    @Override
    void frost() {
        System.out.println("Frosting the cake with cream cheese frosting...");
    }
}
