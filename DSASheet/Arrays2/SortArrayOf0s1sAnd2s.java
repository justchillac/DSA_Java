package DSASheet.Arrays2;

public class SortArrayOf0s1sAnd2s {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        countSort(arr);
    }

    public static int[] countSort(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
        }
        
        int freq[] = new int[max+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }

        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                nums[j] = i;
                j++;
                freq[i]--;
            }
        }
        System.out.print("[");
        for(int k=0;k<nums.length;k++){
            if(k==nums.length-1) {
                System.out.print(nums[k]);
                continue;    
            }
            System.out.print(nums[k]);
            System.out.print(", ");
        }
        System.out.print("]");
        return nums;
    }
}
