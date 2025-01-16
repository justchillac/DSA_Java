package Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int key = 5;
        int array[] = {1,24,3,46,6,5,4,5,3};
        System.out.println(firstOccurence(array, key, 0));
    }

    public static int firstOccurence(int arr[], int key, int index){
        //Base Case
        if(index == arr.length-1) return -1;
        
        //Operation
        if(key == arr[index]) return index;

        return firstOccurence(arr, key, index+1);
    }
}
