class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length)
        { int c= nums[i]-1;
            if(nums[i]!=nums[c])
            {
               swap(nums,i,c);
            }
            else
            {
                i++;
            }
        }
        // for  missing and duplicate number
        for(int idx=0;idx<nums.length;idx++)
        {
            if(nums[idx]!=idx+1)
            {
                return new int[] {nums[idx],idx+1};
            }
        }
        return new int[]{-1,-1};
    }    
        static void swap(int[] nums,int f,int s)
        {
            int temp=nums[f];
            nums[f]=nums[s];
            nums[s]=temp;
        }
}