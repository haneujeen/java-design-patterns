public abstract class Cake {
    String ingredients;

    final void bakeCake() {
        mix();
        bake();
        cool();
        frost();
    }

    void mix() {
        System.out.println("Mixing ingredients... " + this.ingredients);
    }

    abstract void bake();

    void cool() {
        System.out.println("Cooling the cake...");
    }

    abstract void frost();
}
