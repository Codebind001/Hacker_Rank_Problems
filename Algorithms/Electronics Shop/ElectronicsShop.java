package Algorithms;

import java.util.*;

public class ElectronicsShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] keyboards = new int[n];
        int[] drives = new int[m];

        for(int i=0; i<n; i++){
            keyboards[i] = scanner.nextInt();
        }
        for(int j=0; j<n; j++){
            drives[j] = scanner.nextInt();
        }
        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);
    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b){
        
        int sum=0,max=0;
        for(int i=0; i<keyboards.length; i++){
            for(int j=0; j<drives.length; j++){
                sum = (keyboards[i]+drives[j]);
                if(sum>=max && sum<=b){
                    max=sum;
                }
            }
        }
        if(max == 0){
            return -1;
        }
        return max;
        
    }
    
}
