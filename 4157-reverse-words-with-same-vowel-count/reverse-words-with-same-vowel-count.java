class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        int count=0;
        for(int i=0;i<arr[0].length();i++){
            char ch=arr[0].charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') count++;
        } String ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(countVowel(arr[i])==count) ans=ans+ " "+ reverse(arr[i]);
            else ans=ans+" "+arr[i];
        }
        return ans;
    }
     public int countVowel(String t) {
        int count = 0;
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') count++;
        }
        return count;
    }
    public String reverse(String t){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<t.length();i++){
            sb.append(t.charAt(i));
        }
    return sb.reverse().toString();
    }
}