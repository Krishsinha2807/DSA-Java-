class Solution {
    public int heightChecker(int[] heights) {
     int r[]=new int[heights.length];
     int idx=0;
     for(int i=0;i<heights.length;i++)
     {
        r[idx]=heights[i];
        idx++;
     }
     Arrays.sort(heights);
     int c=0;
     for (int i=0; i<heights.length; i++){
        if(heights[i]!=r[i]) c++;
     }
     return c;

    }
}