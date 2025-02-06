class Test implements Testable{
    public void display(){
        System.out.println("Display 1");
    }
}

public class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}
