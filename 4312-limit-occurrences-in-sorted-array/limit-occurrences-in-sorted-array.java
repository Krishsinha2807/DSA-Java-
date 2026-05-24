class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            count =0;
            for(int j=0;j<list.size();j++){
                if(nums[i]==list.get(j)) count ++;
            }
            if(count<k) list.add(nums[i]);
        }
        int arr[]=new int[list.size()];
        int idx=0;
        for(int i=0;i<list.size();i++){
            arr[idx]=list.get(i);
            idx++;
        }
        return arr;
        
    }
}