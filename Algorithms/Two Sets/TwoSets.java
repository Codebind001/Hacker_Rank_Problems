package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSets {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        List<Integer> alist = new ArrayList<>();
        List<Integer> blist = new ArrayList<>();

        for(int i = 0; i < n; i++){
            alist.add(scan.nextInt());
        }
        for(int i = 0; i < m; i++){
            blist.add(scan.nextInt());
        }
        int result = Result.getTotalX(alist, blist);
        System.out.println(result);
    }
}
class Result{
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count=0, flag; 
        int current_factor=a.get(a.size()-1);
        while(current_factor<=b.get(0)){
            flag = 0;
            for(int i = 0; i<a.size(); i++){
                if(current_factor%a.get(i) != 0){
                    flag=1;
                    break;
                }
            }
            if(flag == 0){
                for(int i=0; i<b.size(); i++){
                    if(b.get(i)%current_factor != 0){
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0){
                count++;
            }
            System.out.println(current_factor);
            current_factor++;
            
        }
       
        return count;
    }
}
