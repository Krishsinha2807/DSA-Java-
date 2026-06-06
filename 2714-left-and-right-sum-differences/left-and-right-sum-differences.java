class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int idx=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum=sum+nums[i];
        } int sum1=sum;
        for(int i=0;i<nums.length;i++){  //rightsum
            sum=sum-nums[i];
            r[idx]=sum;
            idx++;
        } int idx1=0;
        for(int i=nums.length-1;i>=0;i--){//leftsum
            sum1=sum1-nums[i];
            l[i]=sum1;
        }
         for(int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(l[i] - r[i]);
        }
        return ans;

        
    }
}