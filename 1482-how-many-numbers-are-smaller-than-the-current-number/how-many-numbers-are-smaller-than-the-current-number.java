class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j] && j!=i){
                    c++;
                }
            }
            list.add(c);
        }
        int idx=0;
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[idx]=list.get(i);
            idx++;
        }
        return arr;
    }
}