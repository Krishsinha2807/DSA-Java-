class Solution {
    public boolean isGood(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=i+1) return false;
        }
        return nums[n-1]==n-1;
        
    }
}