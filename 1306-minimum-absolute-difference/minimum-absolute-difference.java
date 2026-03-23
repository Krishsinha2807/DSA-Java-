class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int min = Integer.MAX_VALUE; /*int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               int sub= Math.abs(arr[i]-arr[j]);
               if(sub<min)
               {
                min=sub;
               }
               
            }
            list.add(i);
        }  int idx=0;
        for(int k=0;k<list.size();k++)
        {
           arr1[idx]=list.get(k);
           idx++;
        }
      */

        Arrays.sort(arr); 
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, arr[i + 1] - arr[i]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return result;
    }
}