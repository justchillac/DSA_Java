package Stacks2;

import java.util.Stack;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = " Hello World ";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder revString = new StringBuilder("");
        // System.out.println("hi");
        //Creating word stack
        int i = 0;
        while(i<s.length()){
            // System.out.println("loop beginning");
            if(s.charAt(i)==' '){
                i++;
                continue;
            }
            StringBuilder word = new StringBuilder("");
            while(i<s.length() && s.charAt(i)!=' '){
                word=word.append(s.charAt(i));
                // System.out.println("mid loop");
                i++;
            }
            stack.push(word.toString());
            // System.out.println("loop ending");
        }

        //Creating reversed string by popping words one by one
        while(!stack.isEmpty()){
            revString=revString.append(stack.pop()+" ");   
        }
        String reversed = revString.toString();
        reversed = reversed.substring(0, reversed.length()-1);
        // System.out.println(revString.substring(0, revString.length()-1));
        return reversed;
    }
}

