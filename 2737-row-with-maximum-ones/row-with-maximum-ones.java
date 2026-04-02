class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=-1;
        int c=0;
        int row=0;
        for(int i=0;i<mat.length;i++){
            c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            if(c>max)
            {
                max=c;
                row=i;
            }
        }
         return new int[]{row,max};
        
    }
}