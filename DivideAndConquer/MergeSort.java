package DivideAndConquer;

public class MergeSort {
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        divide(arr, 0, arr.length-1);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void divide(int arr[], int si, int ei){
        //Base condition
        if(ei==si){
            return;
        }
        
        int mid = si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
        
    }

    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                merged[k++] = arr[i++];
            }
            else merged[k++] = arr[j++];
        }

        while(i<=mid){
            merged[k++] = arr[i++];
        }

        while(j<=ei){
            merged[k++] = arr[j++];
        }

        for(int index = 0, indexm = si;index<merged.length;index++,indexm++){
            arr[indexm] = merged[index];
        }

    }




}
