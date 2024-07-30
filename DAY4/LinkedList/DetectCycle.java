package DAY4.LinkedList;

import static DAY4.LinkedList.LinkedListImplementation.Node.addNodeLast;
import static DAY4.LinkedList.LinkedListImplementation.Node.displayList;

public class DetectCycle extends LinkedListImplementation{

    public static boolean checkCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2, head);
        Node node2 = new Node(3, node1);
        Node node3 = new Node(4,node2);
        Node node4 = new Node(5,node3);
        head.next=node4;
        boolean ans = checkCycle(head);
        System.out.println(ans);
    }
}
