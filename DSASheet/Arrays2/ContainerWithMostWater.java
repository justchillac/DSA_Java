package DSASheet.Arrays2;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int temp[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(temp));
    }

    public static int maxWater(int[] arr){
        int maxProduct = 0;
        int left = arr[0], right = arr.length-1;
        while(left<right){
            maxProduct = Math.max(maxProduct, (right-left)*Math.min(arr[right], arr[left]));

            if(arr[left]<arr[right]) left++;
            else right--;
        }
        return maxProduct;
    }
}
