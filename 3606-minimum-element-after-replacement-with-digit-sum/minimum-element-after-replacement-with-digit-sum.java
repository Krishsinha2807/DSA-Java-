class Solution {
    public int minElement(int[] nums) {
        int sum=0;
        int arr[]=new int[nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            sum=0;
            while(temp>0){
                int d=temp%10;
                sum=sum+d;
                temp=temp/10;
            }
            arr[idx]=sum;
            idx++;
        }
        Arrays.sort(arr);
        return arr[0];
        
    }
}