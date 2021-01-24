import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DicsonariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> hash_table = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hash_table.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hash_table.containsKey(s)){
                System.out.println(s+"="+hash_table.get(s));
            }
            else System.out.println("Not found");
        }
        in.close();
    }
}
