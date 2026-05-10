class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[2*nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            arr[idx]=nums[i];
            idx++;
        } int idx1=nums.length;
        for(int j=nums.length-1;j>=0;j--){
            arr[idx1]=nums[j];
             idx1++;
        }
        return arr;

        
    }
}