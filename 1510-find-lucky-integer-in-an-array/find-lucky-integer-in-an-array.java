class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int c=0;
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {  c=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==arr[i]) max=Math.max(max,arr[i]);
        }
        return max;
        
    }
}