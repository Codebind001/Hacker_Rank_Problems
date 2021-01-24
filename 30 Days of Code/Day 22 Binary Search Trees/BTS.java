import java.util.*;
import java.io.*;
class Nodes{
    Nodes left,right;
    int data;
    Nodes(int data){
        this.data=data;
        left=right=null;
    }
}

public class BTS {

    public static int getHeight(Nodes root){
        //Write your code here
        if(root ==null)
          return -1;
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return Math.max(left, right) + 1;
    }
    
    public static Nodes insert(Nodes root,int data){
        if(root==null){
            return new Nodes(data);
        }
        else{
            Nodes cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Nodes root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
    
}
