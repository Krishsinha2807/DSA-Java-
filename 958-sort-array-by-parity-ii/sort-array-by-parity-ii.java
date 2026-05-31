class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int idx = 0;
        int r[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                r[idx] = nums[i];
                idx += 2;
            }
        }
        idx = 1; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0) {
                r[idx] = nums[i];
                idx += 2;
            }
        }
        
        return r;
    }
}
