package Stacks;

import java.util.Stack;

public class ReverseAStringUsingStack {
    public static void main(String[] args) {
        String s = "abc";
        reverseString(s);
    }

    public static void reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;

        //Pushing String characters in the stack one by one 
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        //Popping characters one by one to reverse the string
        StringBuilder rev = new StringBuilder("");
        while(!s.isEmpty()){
            char c = s.pop();
            rev.append(c);
        }
        System.out.println(rev);
    }
}
