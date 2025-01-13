package Stacks;

import java.util.Stack;
import Stacks.PushAtBottomOfStack;

public class ReverseStack {
    public static void main(String args[]){
        Stack<Integer> stk = new Stack<>();
        stk.add(1);
        stk.add(2);
        stk.add(3);
        reverseStack(stk);

        while(!stk.isEmpty()){
            System.out.println("|"+stk.pop()+"|");
        }
    }

    public static void reverseStack(Stack<Integer> stac) {
        if(stac.isEmpty()){
            return;
        }

        int top = stac.pop();
        reverseStack(stac);
        PushAtBottomOfStack.pushAtBottomOfStack(stac, top);
    }

    
}
