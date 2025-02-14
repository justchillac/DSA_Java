package Stacks2;

import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String args[]){
        String s1 = "(a+b)";
        String s2 = "(((a+b)+(a+b)))";
        System.out.println(isDuplicate(s1));
        System.out.println(isDuplicate(s2));
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            int count = 0;
            if(str.charAt(i) == ')'){
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count<1) return true;
                else s.pop();
            } else{
                s.push(str.charAt(i));
            }
        }
        return false;
    }
}
