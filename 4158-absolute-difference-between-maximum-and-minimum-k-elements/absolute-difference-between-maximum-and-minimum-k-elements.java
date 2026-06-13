class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }//kam 
        int sum1=0;
        int pos=0;
       for(int i=nums.length-1;i>=0;i--){
        if(pos==k) break;
        sum1=sum1+nums[i];
        pos++;
       } //bada
        return Math.abs(sum1-sum);

    }
}