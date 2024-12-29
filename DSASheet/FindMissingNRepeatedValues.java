package DSASheet;

import java.util.Scanner;

public class FindMissingNRepeatedValues {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        //Creating array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        FindMR(arr);
    }

    public static int[] FindMR(int arr[][]) {
        int n = arr.length;
        int csize = (int)Math.pow(n, 2) + 1; // Adjust size to include n^2
        int countArray[] = new int[csize];
        int a = -1, b = -1;
    
        // Counting occurrences of elements in arr
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                countArray[arr[i][j]]++;
            }
        }
    
        // Finding a (repeated) and b (missing) values
        for (int i = 0; i < csize; i++) {
            if (countArray[i] == 2) {
                a = i; // Repeated number
            }
            if (countArray[i] == 0) {
                b = i; // Missing number
            }
        }
    
        // Assigning a and b values to return array
        int retMatrix[] = {a, b};
        System.out.println("Repeated: " + a);
        System.out.println("Missing: " + b);
        return retMatrix;
    }
    
}
