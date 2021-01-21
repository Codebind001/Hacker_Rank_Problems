package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubArrayDivision {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> s = new ArrayList<>();
        for(int i=0; i<n; i++){
            int temp = scanner.nextInt();
            s.add(temp);
        }
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int result = birthday(s, d, m);
        System.out.println(result);

    }

    static int birthday(List<Integer> s, int d, int m){
        int count = 0;
        // if(s.size()==1 && s.get(0) == d){
        //     count=1;
        //     return count;
        // }
        // for(int i=0; i<s.size()-1; i++){
        //     if((s.get(i)+s.get(i+1))==d){
        //         ++count;
        //     }
        // }
        int n=(s.size()-m);
        int sum=0;
        for(int i=0; i<=n; i++){
            for(int j=0; j<m; j++){
                sum = sum+s.get(j+i);
            }
            if(sum==d){
                count++;
            }
            sum=0;
        }
        return count;
    }
    
}
