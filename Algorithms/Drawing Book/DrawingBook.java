package Algorithms;

import java.util.Scanner;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();    
        int p = scanner.nextInt();
        int result = pageCount(n, p);
        System.out.println(result);
    }
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        int totalPageFromFront = n / 2;
		int targetPageFromFront = p / 2;
		int targetPageFromBack = totalPageFromFront - targetPageFromFront;

		return Math.min(targetPageFromFront, targetPageFromBack);

    }
    
}



        

