public class FinalTest {
    public static void main(String[] args) {
        
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        
        
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();
        
      
        System.out.println("Testing Arjun:");
        arjun.fight();
        arjun.obey();
        System.out.println("Arjun is kind: " + arjun.kind);
        
        
        System.out.println("\nTesting Bheem:");
        bheem.fight();
        bheem.obey();
        System.out.println("Bheem is kind: " + bheem.kind);
        
        
        System.out.println("\nTesting Duryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        System.out.println("Duryodhan is cruel: " + duryodhan.cruel);
        
        
        System.out.println("\nTesting Vikarn:");
        vikarn.fight();
        vikarn.obey();
        System.out.println("Vikarn is cruel: " + vikarn.cruel);
    }
}
