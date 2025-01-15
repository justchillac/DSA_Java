package Recursion;

public class XToPowerNOptimized {
    public static void main(String args[]){
        int x = 2;
        int n = 10;
        System.out.println(PowXNOpt(x, n));
    }

    public static int PowXNOpt(int x, int n){
        //Base Case
        if(n==0) return 1;

        //Operations
        //For even power
        int halfPow = PowXNOpt(x, n/2)*PowXNOpt(x, n/2);
        //For odd power
        if(n%2!=0){
            halfPow = x*halfPow;
        }
        //Recursive call
        return halfPow;
        
    }
}
