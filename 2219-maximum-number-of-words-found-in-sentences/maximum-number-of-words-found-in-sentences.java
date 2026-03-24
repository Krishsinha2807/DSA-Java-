class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=-1;
        for(int i=0;i<sentences.length;i++)
        {
            String s= sentences[i];
            String s1[]=s.split(" ");
            max=Math.max(max,s1.length);
        }
        return max;
    }
}