import java.util.Scanner;

public class StringReview{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=0; i<n; i++){
            String value = scan.nextLine();
            Solution(value);
        } 
    }
    public static void Solution(String item){
        int item_lenght=item.length();
        for(int j=0; j<item_lenght;j++){
            if(j%2==0){
                System.out.printf(""+item.charAt(j));
            }
        }
        System.out.print(" ");
        for(int j=0; j<item_lenght;j++){
            if(j%2!=0){
                System.out.printf(""+item.charAt(j));
            }
        }
        System.out.println();
    }
}