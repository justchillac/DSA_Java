package Recursion;

public class CheckIfArrayIsSorted {
    public static void main(String args[]){
        int array[] = {2,6,8, 11, 10};
        int index = 0;
        System.out.println(isSorted(array, index));
    }

    public static boolean isSorted(int arr[], int index){
        //Base case
        if(index==arr.length-1) return true;
        
        //Operation
        if(arr[index]>arr[index+1]) return false;

        //Recursive call
        return isSorted(arr, index+1);
    }
}
