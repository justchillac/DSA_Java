package DSASheet.Arrays2;

public class MaxSubarrayKadanesAlgo {
    public static void main(String[] args) {
        int temp[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArray2(temp));
    }

    public static int maxSubArray2(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
}
