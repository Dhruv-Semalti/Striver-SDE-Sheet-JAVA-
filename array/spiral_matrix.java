import java.util.*;
public class spiral_matrix {
    
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> a=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;

        while(top<=bottom && left<=right)
        {
            // left to right
            for(int i=left;i<=right;++i)
            {
                a.add(matrix[top][i]);
            }
            top++;
            //  Top to Bottom down the right column
            for (int i = top; i <= bottom; i++) {
                a.add(matrix[i][right]);
            }
            right--;
            
            //Right to Left across the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    a.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //Bottom to Top up the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    a.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return a;
    }
        
       
}