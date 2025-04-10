class Rum extends Decorator{
    Rum(Offering off1){
        this.off1 = off1;
    }
    String getName(){
        return off1.getName() + " with Rum ";
    }
    int getPrice(){
        return off1.getPrice() + 55;
    }
}
    
    