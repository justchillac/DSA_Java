package DSASheet;

class MajorityElement {
    public static void main(String args[]){
       int [] nums = {6, 5, 5};
       System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        int candidate = nums[0];
        int vote = 1;

        for(int i=1;i<nums.length;i++){
            if(vote == 0){
                candidate = nums[i];
                vote = 1;
            }
            else if(candidate == nums[i]){
                vote++;
            }
            else{
                vote--;
            }
        }
        return candidate;
    }
}
