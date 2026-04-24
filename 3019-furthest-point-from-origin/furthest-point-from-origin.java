class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int cl=0;
        int cr=0;
        int cdash=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='L'){
                cl++; 
            }
            else if(ch=='R'){
                cr++;
            }
            else{
                cdash++;
            }
        }
        return Math.abs((cr-cl))+cdash;
      
        
    }
}