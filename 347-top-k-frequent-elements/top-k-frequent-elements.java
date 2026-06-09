class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>key=new ArrayList<>(map.keySet());
        Collections.sort(key,(a,b)->map.get(b)-map.get(a));
        int ans[]=new int[k];
        int idx=0;
        for(int i=0;i<k;i++){
            ans[idx]=key.get(i);
            idx++;
        }
        return ans;
        
    }
}