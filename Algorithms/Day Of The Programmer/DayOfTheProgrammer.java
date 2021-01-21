package Algorithms;

import java.util.Scanner;

public class DayOfTheProgrammer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String result = solve(year);
        System.out.println(result+year);
        
    }
    static String solve( int year ) {

        if( year == 1918 ) {
            return "26.09.";
        }
        if( isLeap( year ) ) {
            return "12.09.";
        }
        else {
            return "13.09.";
        }
    
    }
    
    static boolean isLeap( int year ) {  
        if( year % 4 != 0 ) {
            return false;
        }
        if( year > 1918 && year % 100 == 0 && year % 400 != 0 ) {
            return false;
        }
        return true;
    
    }
    
}
