class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*') st.pop();
            else st.push(s.charAt(i));
        }
        String s1="";
        for (int i = 0; i < st.size(); i++) {
                  char c = st.get(i);
                  s1=s1+c;
        }
        return s1;
        
    }
}