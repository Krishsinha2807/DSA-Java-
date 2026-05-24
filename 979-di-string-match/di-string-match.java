class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        ArrayList<Integer>list=new ArrayList<>();
        int l=0;
        int h=n;
        int i=0;
        while(i<n){
            if(s.charAt(i)=='I'){
                list.add(l);
                l++;
            }
            else {list.add(h);
            h--;}
            i++;
        }
        list.add(l);
        int ans[]=new int[list.size()];
        int idx=0;
        for(int k=0;k<list.size();k++){
            ans[idx]=list.get(k);
            idx++;
        }
        return ans;
        
    }
}