class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0,ls=0,rs=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        } 
        for(int i=0;i<nums.length;i++){
            rs=sum-ls-nums[i];  //total -leftside-middle
            if(ls==rs) return i;
            ls=ls+nums[i];
        }
        return -1;
    }
}