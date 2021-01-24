import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int [] a){
        this.elements = a;
    }
        
    public void computeDifference(){
        int max=elements[0];
        int min=elements[0];
        //max value
        for(int j=1; j<elements.length; j++){
            if(elements[j]>max){
                max=elements[j];
            }
        }
        System.out.println(max);
        //minimum value
        for(int k=1; k<elements.length; k++){
            if(elements[k]<min){
                min=elements[k];
            }
        }
        System.out.println(min);
        //Calculate Difference
        for(int i=min; i<max; i++){
            maximumDifference++;
        }

    }    

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}