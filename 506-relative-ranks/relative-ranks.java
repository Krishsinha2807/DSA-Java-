class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<score.length;i++){
            list.add(score[i]);
        }
        Arrays.sort(score);
        int idx=0;
        int r[]=new int[score.length];
        int rank=1;
        for(int i=score.length-1;i>=0;i--)
        {
           r[idx]=score[i];
           idx++;
           rank++;
        }
        String[]ans=new String[score.length];
           for(int i = 0; i < score.length; i++) {
            int pos = list.indexOf(r[i]); 
            if(i == 0)ans[pos] = "Gold Medal";
            else if(i == 1)ans[pos] = "Silver Medal";
            else if(i == 2) ans[pos] = "Bronze Medal";
            else ans[pos] = "" + (i + 1);
        }
        return ans;
    }
}