package LinkedLists2;

public class ZigZagLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String args[]){
        ZigZagLL ll = new ZigZagLL();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);
        ll.printList();

        ll.createZigZagLL(head);
        ll.printList();
    }

    public static void printList() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void createZigZagLL(Node head){
        //Step 1: Get the middle node
        Node mid = getMid(head);

        //Step 2: Reverse the second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Step 3: Alternate merging
        Node LH = head;
        Node RH = prev;
        Node nextLH, nextRH;

        while (LH!=null && RH!=null) {
            nextLH = LH.next;
            LH.next = RH;
            nextRH = RH.next;
            RH.next = nextLH;
            LH = nextLH;
            RH = nextRH;
        }
    }

    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
