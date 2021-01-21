package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp;
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            temp = scanner.nextInt();
            arr.add(temp);
        }
        int result = migratoryBirds(arr);
        System.out.println(result);
    }

    static int migratoryBirds(List<Integer> arr) {

        int n = arr.size();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[arr.get(i)]++;
        }
        int max = 0,maxpos=0;
        for(int i = 0 ; i < n ; i++){
            if(array[i] > max){
                max = array[i];
                maxpos = i;
            }
        }
        return maxpos;
    }
    
}
