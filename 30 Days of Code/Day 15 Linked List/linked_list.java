import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class linked_list {

    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null){
            return new Node(data);
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;

        }
        tmp.next = new Node(data);
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int element = sc.nextInt();
            head = insert(head,element);
        }
        display(head);
        sc.close();
    }
    
}
