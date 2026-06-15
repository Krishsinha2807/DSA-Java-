class Solution {
    public int alternatingSum(int[] nums) {
        int es=0,os=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) es=es+nums[i];
            else os=os+nums[i];
        }
        return es-os;
        
    }
}