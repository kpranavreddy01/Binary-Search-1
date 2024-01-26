// Search a 2D Matrix
// TC=log(m+n)
// SC=O(n)
// it was solved in leet code

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length ==0) return false;
        int m= matrix.length;
        int n=matrix[0].length;
        int r,c,mid,low=0,high=m*n-1;
        while(low<=high){
            mid=low+(high-low)/2;
            r=mid/n;
            c=mid%n;
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                low = mid+1;
            }else high=mid-1;

        }

        return false;
    }
}