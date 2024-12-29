package DSASheet;

import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 9};
        mergeSortedArray(nums1, nums2);
    }

    public static int[] mergeSortedArray(int arr1[], int arr2[]){
        int len = -1;
        if(arr1.length>arr2.length){
            len = arr1.length;
        }
        else{
            len = arr2.length;
        }
        int resArr[] = new int[len];

        //Merging Logic
        int ptr1 = 0, ptr2 = 0, i=0;
        while (i<resArr.length && arr1[ptr1]!=0 && arr2[ptr2]!=0) {
            if(arr1[ptr1]<arr2[ptr2]){
                resArr[i]=arr1[ptr1];
                ptr1++;
            }
            else{
                resArr[i]=arr2[ptr2];
                ptr2++;
            } 
            i++;   
        }

        while(ptr1<arr1.length && arr1[ptr1]!=0){
            resArr[i]=arr1[ptr1];
            ptr1++;
            i++;
        }
   
        while(ptr2<arr2.length && arr2[ptr2]!=0){
            resArr[i]=arr2[ptr2];
            ptr2++;
            i++;
        }

        return resArr;
            
    }
}
