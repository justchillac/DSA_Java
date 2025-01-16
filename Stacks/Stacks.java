package Stacks;

import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.LinkedList;
import java.util.Stack;

public class Stacks {

    //implementation using array list
    static class StackA{
        static ArrayList<Integer> list = new ArrayList<>();
        //isEmpty method
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            //Corner case
            if(list.size() == 0) return -1;
            //Actual code
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            return list.get(list.size()-1);
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Using Linked List
    static class StackB {
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]){
        StackA sa = new StackA();
        sa.push(1);
        sa.push(2);
        sa.push(3);

        while(!sa.isEmpty()){
            System.out.println(sa.peek());
            sa.pop();
        }

        StackB sb = new StackB();
        sb.push(4);
        sb.push(5);
        sb.push(6);

        while (!sb.isEmpty()) {
            System.out.println(sb.peek());
            sb.pop();
        }

        //Stack implementation using JCF
        Stack s = new Stack<>();
        sb.push(7);
        sb.push(8);
        sb.push(9);

        while (!sb.isEmpty()) {
            System.out.println(sb.peek());
            sb.pop();
        }
    }
}
