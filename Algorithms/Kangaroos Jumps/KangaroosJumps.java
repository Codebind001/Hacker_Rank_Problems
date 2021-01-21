package Algorithms;

import java.io.*;
import java.util.*;


public class KangaroosJumps {
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String response = "NO";
        if((x2 - x1) != 0 &&  (v2 - v1)!=0){
        boolean equals = (x2 - x1) % (v2 - v1) == 0;
        if(equals){ 
            if(v1>=v2){
                response = "YES";
            }      
        }
       }
        return response;
    }

    public static void main(String[] args) throws IOException {
    
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
