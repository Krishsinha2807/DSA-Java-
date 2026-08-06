class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int des[]=new int[nums.length];
        int idx=0;
        for(int i=nums.length-1;i>=0;i--){
            des[idx]=nums[i];
            idx++;
        } 
        return des[k-1];
    }}
        /*int target = nums.length - k;
        return quickSelect(nums,0,nums.length-1,target);
    }
    private int quickSelect(int[] nums,int low,int high,int target) {
        int pivotIndex=partition(nums, low,high);
        if (pivotIndex==target)return nums[pivotIndex];
        if (pivotIndex>target)return quickSelect(nums,low,pivotIndex-1,target);
        return quickSelect(nums, pivotIndex + 1, high, target);
    }
    private int partition(int[] nums,int low,int high) {
        int pivot=nums[high];
        int i=low;
        for(int j=low;j<high;j++) {
            if (nums[j]<=pivot) {
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,high);
        return i;
    }
    private void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}*/