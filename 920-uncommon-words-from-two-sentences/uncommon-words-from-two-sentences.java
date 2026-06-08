class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
    String arr[]=s1.split(" ");
    String arr1[]=s2.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        ArrayList<String>list=new ArrayList<>(map.keySet());
        ArrayList<String> list1 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String word=list.get(i);
            if(map.get(word)==1) list1.add(word);
        }
        String ans[]=new String[list1.size()];
        int idx=0;
        for(int i=0;i<list1.size();i++){
            ans[idx]=list1.get(i);
            idx++;
        }
        return ans;
        
    }
}