class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[idx]=(int)Math.pow(nums[i],2);
            idx++;
        }
        Arrays.sort(arr);
        return arr;
        
    }
}