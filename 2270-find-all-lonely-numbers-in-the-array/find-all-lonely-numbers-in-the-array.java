class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(int num:map.keySet()){
            if(map.get(num)==1 && !map.containsKey(num-1) && !map.containsKey(num+1))
            res.add(num);
        }
        return res; 
    }
}