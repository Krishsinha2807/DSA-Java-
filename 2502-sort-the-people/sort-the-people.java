class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        /*ArrayList<String>list=new ArrayList<>();*/
        HashMap<Integer,String>map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }   //180-mary,165-john,170-emma
        Arrays.sort(heights);
        String res[]=new String[names.length];
        int idx=0;
        for(int i=heights.length-1;i>=0;i--){
            res[idx]=map.get(heights[i]);
            idx++;
        }
        return res; 
    }
}