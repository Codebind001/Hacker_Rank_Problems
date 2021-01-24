import java.io.*;
import java.util.*;

public class Recursion {
    // Complete the factorial function below.
    static int factorial(int n) {
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        System.out.println(result);
    }
}
