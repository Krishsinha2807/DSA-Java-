class Solution {
    public int passwordStrength(String password) {
        int count=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
             set.add(ch);
        }
        char arr[]=new char[set.size()];
        int idx=0;
        for(char ch:set){
            arr[idx]=ch;
            idx++;
        }
        for(int i=0;i<set.size();i++){
            char ch=arr[i];
            if(ch>='A' && ch<='Z') count=count+2;
            else if(ch>='a' && ch<='z') count =count+1;
            else if(Character.isDigit(ch)) count =count +3;
            else count =count +5;
        }
        return count;
       /* for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(ch>='A' && ch<='Z') count=count+2;
            else if(ch>='a' && ch<='z') count =count+1;
            else if(Character.isDigit(ch)) count =count +3;
            else count =count +5;
        }
        return count;*/  
    }
}