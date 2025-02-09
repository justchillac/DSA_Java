package LinkedLists2;

public class MergeSortOnLL {

    public static class Node{
        int data; 
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String args[]){
        MergeSortOnLL ms = new MergeSortOnLL();
        ms.head = new Node(5);
        ms.head.next = new Node(4);
        ms.head.next.next = new Node(3);
        ms.head.next.next.next = new Node(2);
        ms.head.next.next.next.next = new Node(1);
        ms.printList();
        head = mergeSort(head);
        // System.out.println();
        ms.printList();

        System.out.println("This is just to test how to resolve conflicts");

    }

    public static void printList() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node mergeSort(Node head){
        //Base case
        if(head==null || head.next==null){
            return head;
        }
        Node mid = getMid(head);
        Node rightNode = mid.next;
        Node leftNode = head;
        mid.next = null;

        Node newLeftNode = mergeSort(leftNode);
        Node newRightNode = mergeSort(rightNode);
        return merge(newLeftNode, newRightNode);
    }

    public static Node merge(Node left, Node right){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        
        while(left!=null && right!=null){
            if(left.data<right.data){
                temp.next = left;
                left = left.next;
            }
            else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next;
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
