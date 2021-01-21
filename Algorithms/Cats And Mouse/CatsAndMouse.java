package Algorithms;

import java.util.Scanner;

import jdk.jfr.Unsigned;

public class CatsAndMouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }
    }

    static String catAndMouse(int x, int y, int z){
        int a=0,b=0;
        String result;
        if(x>z || x<z){
            a = Math.abs(x - z);
        }
        if(y>z || y<z){
            b = Math.abs(y-z);
        }
        if(a>b){
            result = "Cat B";
        }
        else if(a<b){
            result = "Cat A";
        }
        else result = "Mouse C";
        
        return result;
    }
    
}
