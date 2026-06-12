class Solution {
    public boolean closeStrings(String word1, String word2) {
        /* boolean used[] = new boolean[26];
        for(int i=0;i<26;i++){
            if(freq1[i]==0)
                continue;
            boolean found = false;
            for(int j=0;j<26;j++){

                if(!used[j] && freq1[i]==freq2[j]){
                    used[j]=true;
                    found=true;
                    break;
                }
            }
            if(!found)
                return false;
        }
        return true;*/

        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char ch=word1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<word2.length();i++){
            char ch1=word2.charAt(i);
            map2.put(ch1,map2.getOrDefault(ch1,0)+1);
        }
        /*f(!map1.keySet().equals map2.keySet()) return false;*/
        if(!map1.keySet().equals(map2.keySet())) return false;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(char ch : map1.keySet()){
            list1.add(map1.get(ch));
        }
        for(char ch : map2.keySet()){
            list2.add(map2.get(ch));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.equals(list2)) return true;
        return false;  
    }
}