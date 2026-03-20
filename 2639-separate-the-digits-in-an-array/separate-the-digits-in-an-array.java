class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>list=new  ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {   ArrayList<Integer>list1=new  ArrayList<>();
            int temp=nums[i];
            while(temp!=0)
            {
                int d=temp%10;
                list1.add(d);
                temp=temp/10;
            }
            for(int j=list1.size()-1;j>=0;j--)
            {
                list.add(list1.get(j));
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
        
    }
}