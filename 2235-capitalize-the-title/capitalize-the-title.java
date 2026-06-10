class Solution {
    public String capitalizeTitle(String title) {
       String arr[]=title.split(" ");
       for(int i=0;i<arr.length;i++){
        String s=arr[i];
        if(s.length()==1 || s.length()==2) s=s.toLowerCase();
        else{
            s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        }
        arr[i]=s;
       } String x="";
       for(int i=0;i<arr.length;i++){
        x=x+ arr[i]+" ";
       }
       return x.trim();
        
    }
}