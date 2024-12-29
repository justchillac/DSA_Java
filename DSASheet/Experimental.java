package DSASheet;

import java.util.Scanner;

public class Experimental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int size = arr.length;
        System.out.println(size);

        //Creating array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
