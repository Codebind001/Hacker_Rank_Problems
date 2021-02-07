package Algorithms;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        
        int n = arr.length;
        double positive=0, negative=0, zero=0;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
            else{zero++;}
        }
        
        System.out.println(positive/n);
        System.out.println(negative/n);
        System.out.println(zero/n);
    }
}
