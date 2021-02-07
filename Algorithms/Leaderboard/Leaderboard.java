package Algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Leaderboard {
    public static void main(String[] args) {
        List<Integer> player = new ArrayList<>();
        List<Integer> ranked = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int j = 0; j < n; j++) {
            ranked.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            player.add(scanner.nextInt());
        }
        List<Integer> result = climbingLeaderboard(ranked, player);
        System.out.println(result);

    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here

        List<Integer> rank = new ArrayList<>();

        ranked = ranked.stream().distinct().collect(Collectors.toList());
        ranked.sort(Comparator.reverseOrder());
        int tmp = 0;
        for (int j = 0; j < player.size(); j++) {
            int temp = ranked.size() - 1;
            if (ranked.get(temp) > player.get(j)) {
                tmp = (ranked.size() + 1);
            }
            for (int i = 0; i < ranked.size(); i++) {
                if (ranked.get(i) <= player.get(j)) {
                    tmp = i + 1;
                    break;
                }
            }
            rank.add(tmp);
        }
        return rank;
    }
}
