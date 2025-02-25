// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yess
// Three line explanation of solution in plain english: 
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        int top=0;
        int bottom= m-1;
        int left=0;
        int right= n-1;

        List<Integer> result= new ArrayList<>();

        while(top<=bottom && left<= right){
            for(int j= left; j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int j=right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom; i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
           
        }
        return result;
    }
}
