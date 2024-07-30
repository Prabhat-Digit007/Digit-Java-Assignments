package DAY4.LinkedList;

import java.util.LinkedList;

public class SearchingMiddleNode extends LinkedListImplementation{

    public static Node searchMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast==null) return slow.next;
        else return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2, head);
        Node node2 = new Node(3, node1);
        Node node3 = new Node(4,node2);
        Node node4 = new Node(5,node3);
        System.out.println(searchMiddle(node4).data);
    }
}
