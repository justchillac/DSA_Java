package DSASheet;

public class PowXN {
    public static void main(String[] args) {
        double x = 2.0;
        int n = -2;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        double res = 1.0;
        if(n>0){
            for(int i=0;i<n;i++){
                res *= x;
            }
        }
        else if(n==0){
            res = 1;
        }
        else if(n<0){
            for(int i=n;i<0;i++){
                res *= 1/x;
            }
        }
        return res;
    }
}
