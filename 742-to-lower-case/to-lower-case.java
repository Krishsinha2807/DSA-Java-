class Solution {
    public String toLowerCase(String s) {
        String s2="";       
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)) s2=s2+Character.toLowerCase(ch);
            else s2=s2+ch;
        }
        return s2;
        
    }
}