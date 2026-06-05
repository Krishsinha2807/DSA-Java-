class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        /*for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i!=j&&(nums[i]|nums[j])%2==0){
                    return true;
                }
            }
        }*/
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) c++;
            if(c>=2) return true;
        }
        return false;
        
    }
}