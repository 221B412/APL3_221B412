abstract class Beverage {
    protected void pour(int qty) {
        System.out.println("Pour " + qty + "ml of beverage");
    }

    protected abstract void addCondiment();

    protected void stir() {
        System.out.println("Stirring the beverage");
    }

    protected void serve() {
        System.out.println("Serve through waiter");
    }

    public void templateMethod(int qty) {
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}
