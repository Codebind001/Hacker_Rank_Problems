package Algorithms;

import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = scanner.nextInt();
        }
        int result = divisibleSumPairs(n,k,ar);
        System.out.println(result);
    }

    static int divisibleSumPairs(int n, int k, int[] ar){
        int count=0;
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n; j++) {
                if(j>i){
                    temp = ar[j]+ar[i];
                    if(temp%k==0){
                        count++;
                    }
                }                
            }
            
        }
        return count;
    }
    
}
