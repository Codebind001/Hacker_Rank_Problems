package Algorithms;

import java.util.Scanner;

public class FormingAMagicSquare {
    public static void main(String[] args) {
        int[][] s = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                s[i][j] = scanner.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
    }

    static int formingMagicSquare(int[][] s){
        int[][] magicSquares = new int[][]{
            {8, 3, 4, 1, 5, 9, 6, 7, 2},// 1
            {4, 3, 8, 9, 5, 1, 2, 7, 6},// 2
            {8, 1, 6, 3, 5, 7, 4, 9, 2},// 3
            {6, 1, 8, 7, 5, 3, 2, 9, 4},// 4
            {2, 9, 4, 7, 5, 3, 6, 1, 8},// 5
            {4, 9, 2, 3, 5, 7, 8, 1, 6},// 6
            {2, 7, 6, 9, 5, 1, 4, 3, 8},// 7
            {6, 7, 2, 1, 5, 9, 8, 3, 4},// 8
            // {8, 1, 6, 6, 1, 8, 4, 9, 2},// 1
            // {6, 1, 8, 7, 5, 3, 2, 9, 4},// 2
            // {4, 9, 2, 3, 5, 7, 8, 1, 6},// 3
            // {2, 9, 4, 7, 5, 3, 6, 1, 8},// 4
            // {8, 3, 4, 1, 5, 9, 6, 7, 2},// 5
            // {4, 3, 8, 9, 5, 1, 2, 7, 6},// 6
            // {6, 7, 2, 1, 5, 9, 8, 3, 4},// 7
            // {2, 7, 6, 9, 5, 1, 4, 3, 8},// 8
        };
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < magicSquares.length; i++){
            int total = 0;
            for(int j = 0; j < magicSquares[i].length; j++){
                total += Math.abs(s[j/3][j%3] - magicSquares[i][j]);
            }
            if(total<min){
                min=total;
            }
        }
        return min;
    }
    
}
