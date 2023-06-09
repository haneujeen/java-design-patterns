public class ChocolateCake extends Cake {
    ChocolateCake() {
        this.ingredients = "2 cups all-purpose flour, 2 cups sugar, 3/4 cup unsweetened cocoa powder, 1 1/2 teaspoons baking powder, 3/4 teaspoon baking soda, 1 teaspoon salt, 2 eggs, 1 cup milk, 1/2 cup vegetable oil, 2 teaspoons vanilla extract";
    }

    @Override
    void bake() {
        System.out.println("Baking the chocolate cake at 350 degrees for 30 minutes...");
    }

    @Override
    void frost() {
        System.out.println("Frosting the cake with chocolate frosting...");
    }
}
