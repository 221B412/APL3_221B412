class Beer extends Beverage {
    @Override
    protected void addCondiment() {
        System.out.println("Add a dash of salt to beer");
    }
}
