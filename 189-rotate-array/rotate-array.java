public class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        ArrayList<Integer>list =new ArrayList<>();
         for(int i=0;i<n;i++)
      {
          list.add(arr[i]);
      }
      Collections.rotate(list,k);
      for(int i=0;i<n;i++)
      {
          arr[i]=list.get(i);
      }
}   }
