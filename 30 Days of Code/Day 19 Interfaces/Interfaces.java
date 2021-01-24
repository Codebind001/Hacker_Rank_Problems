import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculate implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int result = n;  
        return 0;
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculate(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
    
}
