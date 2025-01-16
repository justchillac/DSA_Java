package Recursion;

public class LastOccurence {
    public static void main(String[] args) {
        int key = 5;
        int array[] = {1,24,3,46,6,5,4,5,3};
        System.out.println(lastOccurence(array, key, array.length-1));    
    }

    public static int lastOccurence(int arr[], int key, int index) {
        //Base case
        if(index == 0) return -1;

        //Operation
        if(key == arr[index]) return index;

        return lastOccurence(arr, key, index-1);
    }
}
