package Algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            list.add(scanner.nextInt());
        }
        
        int result = pickingNumbers(list);
        System.out.println(result);

    }
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int count=0, max=0;
        a.sort(Comparator.naturalOrder());
        for(int i=0; i<a.size(); i++){
            for(int j=i; j<a.size(); j++){
                if(a.get(j)-a.get(i) <= 1){
                    count++;
                }
            }
            if(count>max){max=count;}
            count=0;
        }
        
        return max;    
    }
}
