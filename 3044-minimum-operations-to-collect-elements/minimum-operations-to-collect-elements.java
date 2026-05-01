class Solution {
    public int minOperations(List<Integer> nums, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=k;i++)
        {
            list.add(i);
        }  int c=0;
          for(int i=nums.size()-1;i>=0;i--)
          { 
            c++;
            if(list.contains(nums.get(i)))
            {
               list.remove(nums.get(i));
            }
            if(list.size()==0)
            {
                return c;
            }
        }
        return c;
        
    }
}