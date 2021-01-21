package Algorithms;

import java.util.Scanner;

public class CoutingValleys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String path = scanner.nextLine();
        int result = CoutingResult.countingValleys(steps, path);
        System.out.println(result);
    }
}

class CoutingResult{

    public static int countingValleys(int steps, String path) {
        // Write your code here
        char string[] = path.toCharArray();
        int count=0,valleys=0;
        for(int i=0; i<string.length; i++){      
            if(string[i]== 'U'){
                ++count;
            }
            if(string[i]== 'D'){
                --count;                
            }
            if(count==0 && string[i]=='U'){
                ++valleys;
            }
        }
        return valleys;    
    }
}
