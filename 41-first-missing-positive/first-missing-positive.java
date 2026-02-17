class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int c=nums[i]-1;;
            if( nums[i]>0&& nums[i]<=nums.length&& nums[i]!=nums[c])
            {
                swap(nums,i,c);
            }
            else
            {
                i++;
            }
        }
        for(int idx=0;idx< nums.length;idx++)
        {
            if(nums[idx]!=idx+1)
            {
                return idx+1;
            }
        } 
        return nums.length +1;       
    }
    static void swap(int nums[],int f,int s)
    {
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}