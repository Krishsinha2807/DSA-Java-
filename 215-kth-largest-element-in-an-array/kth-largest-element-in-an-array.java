class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int des[]=new int[nums.length];
        int idx=0;
        for(int i=nums.length-1;i>=0;i--){
            des[idx]=nums[i];
            idx++;
        } 
        return des[k-1]; 
    }
}