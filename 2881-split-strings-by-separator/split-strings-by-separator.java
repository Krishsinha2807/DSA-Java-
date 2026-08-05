class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String word=words.get(i);
            String arr[]=word.split("\\" + separator);
            for(int j=0;j<arr.length;j++){
               if(!arr[j].equals(""))list.add(arr[j]);
            }
        }
        return list;
        
    }
}