class Solution {
    public int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
          if(isPrime(nums[i])) list.add(i);
       }
       if(list.size()==1) return 0;
        return list.get(list.size() - 1) - list.get(0);
    }
    boolean isPrime(int n){
        int count=0;
        if(n<=1) return false;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count ==2) return true;
        return false;
    }
}