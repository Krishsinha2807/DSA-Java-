class Solution {
    public int firstUniqueEven(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                list.add(nums[i]);
            }
        }
        int ans[]=new int[list.size()];
        int idx=0;
        for(int i=0;i<list.size();i++)
        {
            ans[idx]=list.get(i);
            idx++;
        }  int count=0;
        for(int i=0;i<ans.length;i++)
        {   count =0;
            for(int j=0;j<ans.length;j++)
            {
                if(ans[i]==ans[j])
                {
                    count ++;
                }
            }
            if(count==1)
            {
                return ans[i];
            }
        }
        return -1;
    }
}