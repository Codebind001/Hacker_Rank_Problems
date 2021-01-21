package Algorithms;

import java.util.Scanner;

public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for(int i=0; i<n; i++){
            scores[i] = scanner.nextInt();
        }
        int[] result = breakingRecords(scores);
        System.out.println(result[0] + " " + result[1]);

    }

    static int[] breakingRecords(int[] scores){
        int min = scores[0];
        int max = scores[0];
        int count0 = 0, count1 = 0;
        int[] results = new int[2];
        
        for(int i=0; i<scores.length; i++){
            if(scores[i]>max){
                max=scores[i];
                ++count0;
            }
            if(scores[i]<min){
                min=scores[i];
                ++count1;
            }
        }
        results[0] = count0;
        results[1] = count1;
        return results;
        
    }
    
}
