package Algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class CompareTheTriplets {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int n1 = a.size();
        int alice=0, bob=0;
        //int n2 = b.size();
        for(int i=0; i<n1; i++){
            if(a.get(i)>b.get(i)){
                alice++;
            }
            else if(a.get(i)<b.get(i)){
                bob++;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(alice);
        result.add(bob);
        return result;

    }
}
