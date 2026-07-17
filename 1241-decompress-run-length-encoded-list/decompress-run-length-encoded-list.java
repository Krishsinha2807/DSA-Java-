class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            for(int j=0;j<freq;j++){
                list.add(val);
            }
        }
        int idx=0;
        int res[]=new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[idx]=list.get(k);
            idx++;
        }
        return res; 
    }
}