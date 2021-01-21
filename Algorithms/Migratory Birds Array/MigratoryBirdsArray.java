package Algorithms;

import java.util.Scanner;

public class MigratoryBirdsArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp;
        //List<Integer> arr = new ArrayList<>();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            //temp = scanner.nextInt();
            //arr.add(temp);
            arr[i] = scanner.nextInt();
        }
        int result = migratoryBirds(n, arr);
        System.out.println(result);
    }

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int ary[] = new int[n];
        for(int i = 0; i < n ; i++ ){
            ary[ar[i]]++;
        } 
        int max = 0,maxpos=0;
        for(int i = 0 ; i < n ; i++){
            if(ary[i] > max){
                max = ary[i];
                maxpos = i;
            }
        }
        return maxpos;
        
    }
    
}
