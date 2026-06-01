class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        int arr[]=new int[cost.length];
        int idx=0;
        for(int i=arr.length-1;i>=0;i--){
            arr[idx]=cost[i];
            idx++;
        } 
        for(int i=0;i<arr.length;i++){
            if((i+1)%3!=0) sum=sum+arr[i];
        }
        return sum;
        
    }
}