class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int abs=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1 && nums[j]==2){
                     abs=Math.abs(i-j);
                     min=Math.min(min,abs);
                }
            }
        }
       if(min==Integer.MAX_VALUE) return -1;
       return min;
    }
}