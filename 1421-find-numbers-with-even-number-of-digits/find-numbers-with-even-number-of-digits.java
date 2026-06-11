import java.util.*;
public class Solution {
      public int findNumbers(int[] nums)  {
        int c=0;
        int c1=0;
        for(int j=0;j<nums.length;j++)
            {
               int num=nums[j];
                    c=0;
                while(num>0)
                    {
                        int d=num%10;
                        c++;
                        num=num/10;
                    }
                if(c%2==0) c1++;
            }   
      return c1;
    }
}