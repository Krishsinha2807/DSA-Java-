class Solution {
    public boolean canJump(int[] nums) {
        int l=nums.length-1;
        int jump=0;
        for(int i=0;i<nums.length;i++){
           if(i>jump)return false;
           jump=Math.max(jump,i+nums[i]);
           if(jump>=l)return true;

        }
        return false;
    }
}