class Solution {
    public int rowWithMax1s(int[][] mat) {
       int row=mat.length;
       int col=mat[0].length;
       int max=-1;
       int index=-1;
       int r=0;
       int c=mat[0].length-1;
       while(r<row && c>=0)
       {
         int i=mat[r][c];
          if(i==1)
          {
            --c;
           index=r;
          }
          else
          {
            ++r;
          }
       }
       return index;
    }
}