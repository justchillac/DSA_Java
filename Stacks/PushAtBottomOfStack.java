package Stacks;

import java.util.Stack;

public class PushAtBottomOfStack {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int item = 4;
        pushAtBottomOfStack(s, item);
        while(!s.isEmpty()){
            System.out.println("|"+s.pop()+"|");
        }
    }

    public static void pushAtBottomOfStack(Stack<Integer> s, int item){
        if(s.isEmpty()){
            s.push(item);
            return;
        }
        int top = s.pop();
        pushAtBottomOfStack(s, item);
        s.push(top);
    }

}
