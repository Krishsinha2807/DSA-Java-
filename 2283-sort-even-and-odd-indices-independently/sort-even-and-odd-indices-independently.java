class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2!=0) list.add(nums[i]);
            else list1.add(nums[i]);
        }
        Collections.sort(list1);
        Collections.sort(list,Collections.reverseOrder());
        int ans[]=new int[nums.length];
        int idx=0;
        int l=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2!=0) ans[idx]=list.get(l++);
            else ans[idx]=list1.get(m++);
            idx++;
        }
        return ans;
        
    }
}