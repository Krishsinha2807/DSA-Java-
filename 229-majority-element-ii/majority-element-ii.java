class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>key=new ArrayList<>(map.keySet());
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<key.size();i++){
            if(map.get(key.get(i))>n/3) list.add(key.get(i));
        }
        return list; 
    }
}