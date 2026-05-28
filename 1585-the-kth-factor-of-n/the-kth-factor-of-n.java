class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                list.add(i);
            }
        }  int arr[]=new int[list.size()];
        int idx=0;
        for(int i=0;i<list.size();i++)
        {
            arr[idx]=list.get(i);
            idx++;
        }    if(k > list.size()) return -1;
        Arrays.sort(arr);
        return arr[k-1];
        
    }
}