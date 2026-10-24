class Solution {
    static boolean binarySearch(int[] matrix,int target) {
        int low=0,high = matrix.length-1;
        while(low <= high) {
            int mid = low + (high - low) /2;
            if(matrix[mid] == target) {
                return true;
            }else if(matrix[mid] < target) {
                low = mid +1 ;
            }else {
                high = mid -1 ;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean ans = false;
        for(int i=0;i< m;i++) {
            if(matrix[i][0] <= target && target <= matrix[i][n-1]) {
                ans = binarySearch(matrix[i],target);
                if(ans == true) {
                    return ans;
                }
            }
        }
       
        return false;
    }
}