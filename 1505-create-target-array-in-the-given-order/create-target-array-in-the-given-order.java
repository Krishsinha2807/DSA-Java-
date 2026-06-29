class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int idx=0;
        int arr[]=new int[list.size()];
        for(int l=0;l<list.size();l++){
            arr[idx]=list.get(l);
            idx++;
        }
        return arr;
        
    }
}