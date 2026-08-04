class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        } int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }if(nums[i]<min)
                min=nums[i];
        }
        for(int i=min;i<=max;i++){
            if(!list.contains(i)) res.add(i);
        }
        return res; 
    }
}