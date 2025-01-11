package LinkedLists;

// import DSASheet.LinkedLists.ReverseLinkedList2.ListNode;

public class LinkedList {
    //Creating a Node blueprint
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        } 
    }
    //Creating head and tail
    public static Node head;
    public static Node tail;
    public static int size; //By default it is set to zero
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.tail = ll.head;
        // ll.head.next = new Node(2);
        // tail = tail.next;
        //Note: I've commented the above lines bcuz these would affect the size variable
        ll.printList();
        ll.addFirst(3);
        ll.printList();
        ll.addLast(4);
        ll.printList();
        addNode(0, 14);
        ll.printList();
        addNode(3, 30);
        ll.printList();
        System.out.println(size);
        // ll.removeFirst();
        // ll.printList();
        // removeLast();
        // printList();
        // System.out.println(size);
        System.out.println(itSearch(30));
        System.out.println(recSearch(head, 30));
        // head = reverseList(head);
        printList();
        // head = removeNthFromEnd(head, 2);
        printList();
        Node mid = middleNode(head);
        System.out.println(mid.data);
        addLast(4);
        addLast(3);
        addLast(14);
        printList();
        System.out.println(isPalindrome(head));
    }

    public static void addFirst(int data){
        //Creating reference and constructor for new node
        Node newNode = new Node(data);

        //When List is empty;
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        
        //When list has a node or contain nodes
        newNode.next = head;
        head = newNode;
        size++;
    }

    public static void addLast(int data){
        //Creating a node constructor
        Node newNode = new Node(data);
        //If list is empty
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        //If nodes exist in the list
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public static void printList(){
        //If list is empty
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        //Initializing temp
        Node temp = head;

        //Printing elements till tail
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        return;
    }

    //To add in middle of LL
    public static void addNode(int index, int data){
        //Creating a new node
        LinkedList ll = new LinkedList();
        Node newNode = new Node(data);
 
        //Exception case
        if(index == 0){
            addFirst(data);
            return;
        }

        Node temp = ll.head;
        int i = 0;
        while(i<index-1){
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public static void removeFirst(){
        //Exception case
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        else if(size==1){
            size = 0;
            head = null;
            tail = null;
            return;
        }
        
        //normal cases
        head = head.next;
        size--;
    }

    public static void removeLast(){
        //Exceptional cases
        if(size == 0){
            System.out.println("List is empty");
            return;
        }
        else if(size == 1){
            size = 0;
            head = null;
            tail = null;
            return;
        }

        //Normal cases
        //Creating a temp Node which we'll soon place to the previous of last node
        Node temp = head;
        int i = 0;
        
        //Placing temp to the previous of last node
        while(i<size-2){
            i++;
            temp = temp.next;
        }
        //now we have prev of last node that is temp
        temp.next = null;
        tail = temp;
        size--;
    }

    public static int itSearch(int key){
        int i = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public static int recSearch(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = recSearch(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node middleNode(Node head) {
        //using the two pointers approach
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node removeNthFromEnd(Node head, int n) {
        //First we get the size of the LL
       Node temp = head;
       int size = 0;
       while(temp != null){
            size++;
            temp = temp.next;
       }
       //Exception case 
       if(n == size){
        head = head.next;
        return head;
       }
        //Next let's try to get the index of the nth node
        int index = size - n;
        int i = 0;
        Node prev = head;
        temp = head;

        while(i < index){
            i++;
            temp = temp.next;
        }
        i = 0;
        while(i < index-1){
            i++;
            prev = prev.next;
        }
        prev.next = temp.next;
        // temp.next = null;
        return head;
    }

    public static boolean isPalindrome(Node head) {
       if(head == null || head.next == null) return true; //Single node or empty list

       //Step 1: Getting the middle node
       Node mid = middleNode(head);

       //Step 2 : reverse 2nd half 
       Node prev = null;
       Node curr = mid;
       Node next;
       while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       Node right = prev;
       Node left = head;

       //Step 3 Keep on comparing the data of LL from both sides
       while (right != null) {
        if(left.data != right.data) return false;
        right = right.next;
        left = left.next;
       }
       return true;

    }

}
