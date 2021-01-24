
import java.util.*;

public class Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipPercent = tip_percent;
        double taxPercent = tax_percent;
        double tip = (meal_cost*(tipPercent/100));
        double tax = (meal_cost * (taxPercent / 100));
        //double total_cost = meal_cost + tip + tax;
        int total_cost = (int)Math.round(meal_cost + tip + tax);
        System.out.println(total_cost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}