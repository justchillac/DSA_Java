package Backtracking;

import java.util.Scanner;

public class FindPermutations {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ipstr = sc.nextLine();
        findPermutations(ipstr, "");
    }

    public static void findPermutations(String str, String ans){
        //Base Case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }

        //Recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(NewStr, ans+curr);
        }
    }
}
//TC:- O(n*n!)