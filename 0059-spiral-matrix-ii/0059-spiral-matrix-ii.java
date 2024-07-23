class Solution {
    public int[][] generateMatrix(int n) {
       int result[][]=new int[n][n];
       int startRow=0;
       int endRow=n-1;
       int startColumn=0;
       int endColumn=n-1;
       int k=1;
       while(startRow<=startRow && startColumn<=endColumn){
         //for first row
          for(int i=startRow;i<=endColumn;i++){
             result[startRow][i]=k++;
          }++startRow;
          //for last column
          for(int i=startRow;i<=endRow;i++){
             result[i][endColumn]=k++;
          }--endColumn;
          //for last row
          if(startRow<=endRow){
             for(int i=endColumn;i>=startColumn;i--){
             result[endRow][i]=k++;
             }--endRow;
          }
          //for first column
          if(startColumn<=endColumn){
            for(int i=endRow;i>=startRow;i--){
             result[i][startColumn]=k++;
            }++startColumn;
          }
       }
       return result;
    }
}