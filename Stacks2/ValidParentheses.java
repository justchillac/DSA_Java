package Stacks2;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String stg = "{}[][()]";
        System.out.println(validParentheses(stg));
    }

    public static boolean validParentheses(String str){
        Stack<Character> s =  new Stack<>();
        
        for(int i = 0;i < str.length(); i++){
            char curr = str.charAt(i);

            if(!s.isEmpty()){
                char last = s.peek();
                if(isPair(last, curr)){
                    s.pop();
                    continue;
                }
            }
            s.push(curr);
        }
        return s.isEmpty();
    }

    private static boolean isPair(char last, char curr){
        return (last == '(' && curr == ')') || (last == '[' && curr == ']') || (last == '{' && curr == '}');
    }
}
