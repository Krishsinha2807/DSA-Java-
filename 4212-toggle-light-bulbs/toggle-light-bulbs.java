class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
       HashSet<Integer>set=new HashSet<>();
       for(int i=0;i<bulbs.size();i++){
          if(set.contains(bulbs.get(i)))set.remove(bulbs.get(i));  
          else set.add(bulbs.get(i));
       } 
        ArrayList<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}