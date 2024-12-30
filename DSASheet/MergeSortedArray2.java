package DSASheet;

public class MergeSortedArray2 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 0, 0, 0};
        int arr2[] = {2, 5, 9};
        int m = 3, n = 3;
        System.out.println("Before function call");
        mergeSortedArray2(arr1, m, arr2, n);
    }

    public static void mergeSortedArray2(int nums1[], int m, int nums2[], int n ){
        int[] tempArray = new int[m];
        for(int i = 0; i < m; i++){
            tempArray[i] = nums1[i];
        }

        int left = m;
        int right = n;
        int i = 0;
        int j = 0;
        int idx = 0;

        while(i < left && j < right){
            if(tempArray[i] < nums2[j]){
                nums1[idx] = tempArray[i++]; 
            }else{
                nums1[idx] = nums2[j++];
            }idx++;
        }

        for(int k = i; k < left; k++){
            nums1[idx++] = tempArray[k];
        }
        for(int k = j; k < right; k++){
            nums1[idx++] = nums2[k];
        }
        //Printing the resultant Array
        for(int k = 0;k < nums1.length; k++) {
            System.out.println(nums1[k] + " ");
        }
        System.out.println();
    }
}
