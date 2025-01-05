package DSASheet.Arrays2;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 161;
        System.out.println(searchMatrix(arr,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        for(int i=0;i<m;i++){
            if(target>=matrix[i][0] && target<=matrix[i][n-1]){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==target) return true;
                }
            }
        }
        return false;
    }
}
