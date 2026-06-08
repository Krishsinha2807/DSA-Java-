class Solution {
    public String frequencySort(String s) {
    HashMap<Character,Integer>map=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1); // frquency add krna
    }
    ArrayList<Character>list=new ArrayList<>(map.keySet());//key value ko AL m
    Collections.sort(list,(a,b)-> map.get(b)-map.get(a));//sort in asc ord
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<list.size();i++){
        char ch=list.get(i);
        for(int j=0;j<map.get(ch);j++){
            sb.append(ch);
        }
    }
    return sb.toString();
    }
}