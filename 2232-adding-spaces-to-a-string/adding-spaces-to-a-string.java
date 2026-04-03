/*class Solution {
    public String addSpaces(String s, int[] spaces) {
        String s1="";
        int x=0;
     for(int i=0;i<spaces.length;i++){
        int temp=spaces[i];
        s1=s1+s.substring(x,temp) +" ";
        x=temp;
     }
      s1 = s1 + s.substring(x);
        return s1;
        
    }
}*/
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int prev = 0;
        for(int space : spaces) {
            sb.append(s.substring(prev, space));
            sb.append(" ");
            prev = space;
        }
        sb.append(s.substring(prev));
        return sb.toString();
    }
}