package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int res[] = new int[arr.length];
        res = nextGreater(arr, res);
        for(int i = 0;i<res.length;i++){
            if(res[i]>=0){
                System.out.println(arr[res[i]]);
            }
            else System.out.println(-1);
        }
    }

    public static int[] nextGreater(int nums[], int nums2[]){
        Stack<Integer> s = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            //Popping the top till greater element is found
            while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
                s.pop();
            }
            //Updating the res array
            if(s.isEmpty()) nums2[i] = -1;
            else nums2[i] = s.peek();
            //Pushing current element in the stack
            s.push(i);
        }
        return nums2;
        
    }
}
