class Solution {
    public int[] replaceElements(int[] arr) {
       /* int nums[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){  

        }*/
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int dup=arr[i];
            arr[i]=max;
            max=Math.max(max,dup);
        }
        return arr;
    }
}