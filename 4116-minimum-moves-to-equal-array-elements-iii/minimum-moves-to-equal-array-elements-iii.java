class Solution {
    public int minMoves(int[] nums) {
        int max=0,sum=0,res=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
             res=max-nums[i]+res;
        } return res;  
        
    }
}