class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums,new ArrayList<>(),0,ans); 
        return ans;
    }
    public void subsets(int arr[],List<Integer>ds,int idx, List<List<Integer>> ans){
        if(idx==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[idx]);
        subsets(arr,ds,idx+1,ans);
        ds.remove(ds.size()-1);
        subsets(arr,ds,idx+1,ans);    
    }
}