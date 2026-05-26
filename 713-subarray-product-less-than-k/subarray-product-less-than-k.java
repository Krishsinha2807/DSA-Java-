class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int p=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            p=1;
            for(int j=i;j<nums.length;j++){
                p=p*nums[j];
            if(p<k) count ++;
            else break;
        }
        }
        return count;
        
    }
}