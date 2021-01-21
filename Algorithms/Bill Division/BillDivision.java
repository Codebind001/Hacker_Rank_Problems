package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> bill = new ArrayList<>();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int temp;
        for(int i=0; i<n; i++){
            temp = scanner.nextInt();
            bill.add(temp);
        }
        int b = scanner.nextInt();
        bonAppetit(bill, k, b);
    }
    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int result, sum=0;
        for(int i=0; i<bill.size(); i++){
            sum += bill.get(i); 
        }
        result = (sum - bill.get(k))/2;
        if(result!=b){
            result = b-result;
            System.out.println(result);
        }
        else{
            System.out.println("Bon Appetit");
        }

    }
    
}
