package Algorithms;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        // Write your code here
        int s = arr.get(0).size()-1;
        int p = 0;
        int pmr_diagonal = 0, sdr_diagonal = 0;
        for (int i = 0; i < arr.size(); i++) { 
            for (int j = 0; j < arr.get(i).size(); j++) { 
                if(j==p){
                    pmr_diagonal+=arr.get(i).get(j);
                }
                if(j==s){
                    sdr_diagonal+=arr.get(i).get(j);
                }
            }
            p++;
            s--;
        }
        int result = pmr_diagonal-sdr_diagonal;
        result = Math.abs(result);
        return result;
    }    
}
