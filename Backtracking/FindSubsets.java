package Backtracking;

import java.util.Scanner;

class FindSubsets{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string whose subsets are to be derived");
        String ipstr = sc.nextLine();
        findSubsets(ipstr, "", 0);
    }

    public static void findSubsets(String str, String ans, int i){
        //Base Case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        //Recursion
        //Yes
        findSubsets(str, ans+str.charAt(i), i+1);
        // System.out.println(ans);

        //No
        findSubsets(str, ans, i+1);
        // System.out.println(ans);
        
    }
}