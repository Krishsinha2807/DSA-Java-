class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        ArrayList<Integer>list=new ArrayList<>(); 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           list.add((ch-'0'));
        }
        int arr[]=new int[list.size()];
        int idx=0;
        for(int i=0;i<list.size();i++){
            arr[idx]=list.get(i);
            idx++;
        }
        for(int i=1;i<arr.length;i++){
            if(!(Math.abs(arr[i]-arr[i-1])<=2))  return false;
        }
        return true;
        
    }
}