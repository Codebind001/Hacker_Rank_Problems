package Algorithms;

import java.util.Scanner;

public class Staircase {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);
    }
    static void staircase(int n) {
        int i,j;
        for(i=1; i<=n; i++){
            for(j=i; j<n; j++){
                System.out.printf(" ");
            }
            for(j=0; j<i; j++)
            {
                System.out.printf("#");
            }
            System.out.printf("\n");
            
        }

    }
}
