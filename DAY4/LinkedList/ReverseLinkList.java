package DAY4.LinkedList;

import static DAY4.LinkedList.LinkedListImplementation.Node.addNodeLast;
import static DAY4.LinkedList.LinkedListImplementation.Node.displayList;

public class ReverseLinkList extends LinkedListImplementation{
    public static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node nex = curr.next;
            curr.next=prev;
            prev = curr;
            curr = nex;
        }
        return prev;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head=addNodeLast(head,2);
        head=addNodeLast(head,3);
        displayList(head);
        head=reverseList(head);
        displayList(head);

    }
}
