package Recursion;

public class XToPowerN {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(PowXN(x, n));
    }

    public static int PowXN(int x, int n){
        if(n==0) return 1;
        // if(n==1) return x;       
        return x*PowXN(x, n-1);
    }
}
