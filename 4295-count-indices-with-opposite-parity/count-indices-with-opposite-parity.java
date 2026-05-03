class Solution {
    public int[] countOppositeParity(int[] nums) {
        int ans[]=new int[nums.length];
        int n=nums.length;
        int count=0;
       for(int i=0;i<n;i++){
        count =0;
        for(int j=i+1;j<n;j++){
            if((nums[i] % 2 == 0 && nums[j] % 2 != 0) ||(nums[i] % 2 != 0 && nums[j] % 2 == 0)) count ++;
        }
       ans[i]=count;}
       return ans;
        
    }
}