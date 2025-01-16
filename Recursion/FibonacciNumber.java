package Recursion;
    
public class FibonacciNumber {
        public static void main(String[] args) {
            int x = 5;
            System.out.println(getFib(x));
        }

        public static int getFib(int n){
            if(n==0 || n==1) return 1;
            return getFib(n-1)+getFib(n-2);
        }
    }
