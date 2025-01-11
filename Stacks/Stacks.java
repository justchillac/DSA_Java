package Stacks;

import java.util.ArrayList;

public class Stacks {
    //implementation using array list
    static class StackA{
        static ArrayList<Integer> list = new ArrayList<>();
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

    public static void main(String args[]){
        StackA s = new StackA();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
