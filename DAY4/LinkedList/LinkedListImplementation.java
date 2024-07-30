package DAY4.LinkedList;

public class LinkedListImplementation {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }

        public Node(int data,Node node){
            this.data=data;
            next=node;
        }

        public static Node addNodeFront(Node head,int data){
            Node newNode = new Node(data);
            if (head == null){
                head=newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
            return head;
        }
        public static Node addNodeLast(Node head,int data){
            Node newNode = new Node(data);
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next=newNode;
            return head;
        }


        public static void displayList(Node head){
            while (head.next!=null){
                System.out.println(head.data);
                head = head.next;
            }
            System.out.println(head.data);

        }
    }


    public static void main(String[] args) {
        Node head = new Node(1);
//        Node tail = head;
        head=head.addNodeFront(head,2);
//        head=head.addNodeLast(head, tail, 3);
        head=head.addNodeLast(head, 3);
        head.displayList(head);
    }
}
