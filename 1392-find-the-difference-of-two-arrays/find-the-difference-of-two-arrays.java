class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
           set.add(nums1[i]);
        }
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(!set.contains(nums2[i])&& !list1.contains(nums2[i])) list1.add(nums2[i]);
        }
        set.clear();
        List<Integer> list2=new ArrayList<>();
        for (int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }
        for (int i=0; i<nums1.length; i++){
            int num=nums1[i];
            if (!set.contains(num)){
                if (!list2.contains(num)){
                    list2.add(num);
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>(list2));
        ans.add(new ArrayList<>(list1));
        return ans;  
    }
}