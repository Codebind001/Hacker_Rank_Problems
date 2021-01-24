import java.util.Scanner;

public class String_to_Integer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        isNumber(S);
    }

    static void isNumber(String S){
        try {
            int output = Integer.parseInt(S);
            System.out.println(output);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Bad String");
        }
    }
}
