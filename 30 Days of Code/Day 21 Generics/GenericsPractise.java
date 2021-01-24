/**
 * GenericsPractise
 */
public class GenericsPractise {

    public static <T extends Comparable <T>> T findMax(T a, T b){
        int n = a.compareTo(b);
        System.out.println("N: "+n);
        if(n<0){
            return b;
        }
        else{
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMax(2, 9));
        System.out.println(findMax('g', 'a'));
        System.out.println(findMax("Joy", "Roy"));
        
    }
}