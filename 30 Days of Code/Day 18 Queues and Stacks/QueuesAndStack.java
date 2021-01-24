import java.io.*;
import java.util.*;

public class QueuesAndStack {

    LinkedList queList = new LinkedList<>();
    Stack<Character> stacky = new Stack<>();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStack p = new QueuesAndStack();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    //push on the queue
    public void enqueueCharacter(char s){
        queList.add(s);
    }
    //pop from the queue
    public char dequeueCharacter(){
        return (char)queList.remove();
    }
    //push on the stack
    public void pushCharacter(char s){
        stacky.push(s);
    }
    // pop from the stack
    public char popCharacter(){
        return stacky.pop();
    }
}