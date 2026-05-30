class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        Arrays.sort(tokens);
       /* for(int i=0;i<tokens.length;i++){
            if(tokens[i]<=power){
               power=power-tokens[i];
               score++;
            }
        }
        return score;*/
        int i=0;
        int j=tokens.length-1;
        int max=0;
        while(i<=j){
            if(tokens[i]<=power){
                power=power-tokens[i];
                score++;
                max=Math.max(score,max);
                i++;
            }
            else if(score>0){
                power=power+tokens[j];
                score--;
                j--;
            }
            else break;
        }
        return max;
    }
}