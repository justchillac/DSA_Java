package DSASheet.Arrays2;

public class MaxSubarray {
    public static void main(String[] args) {
        int temp[] = {5,4,-1,7,8};
        System.out.println(maxSubArray(temp));
    }

    public static int maxSubArray(int[] nums) {
        int MaxGlobal = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>MaxGlobal)
                MaxGlobal=sum;
            }
        }
        return MaxGlobal;
    }
}
