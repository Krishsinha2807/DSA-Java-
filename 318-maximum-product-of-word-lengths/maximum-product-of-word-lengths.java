class Solution {
    public int maxProduct(String[] words) {
        //ArrayList<Character>list=new ArrayList<>();-//
       /* int max=0;
        int p=0;
        for(int i=0;i<words.length;i++)
        {
           //String s=words[i];//
           for(int j=i+1;j<words.length;j++){
              if(isSame(words[i],words[j])){
                p=words[i].length()*words[j].length();
                max=Math.max(max,p);
              }           
           } 
        }
        return max;
         }*/
   /* int i=0;
    int j=1;
    int max=0;
     while(i < words.length-1){
        if(j < words.length){
            if(isSame(words[i], words[j])){
                   int p = words[i].length() * words[j].length();
                    max = Math.max(max, p);
            }
                j++;
            }
            else{
                i++;
                j = i + 1;
            }
        }
        return max;
    }
    /*boolean isSame(String x,String y){
        for(int i=0;i<x.length();i++){
            for(int j=0;j<y.length();j++){
                if(x.charAt(i)==y.charAt(j)) return false;
            }
        }
        return true;*/ //TLE
    /*boolean isSame(String x,String y){
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<x.length();i++){
            set.add(x.charAt(i));
        }
        for(int j=0;j<y.length();j++){
            char ch1=y.charAt(j);
            if(set.contains(ch1)) return false;
        }
        return true;*/
          int max = 0;

        HashSet<Character>[] arr = new HashSet[words.length];
        for(int i = 0; i < words.length; i++){
            arr[i] = new HashSet<>();
            for(char ch : words[i].toCharArray()){
                arr[i].add(ch);
            }
        }
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                boolean same = false;
                for(char ch : arr[i]){

                    if(arr[j].contains(ch)){
                        same = true;
                        break;
                    }
                }
                if(!same){

                    int p = words[i].length() * words[j].length();

                    max = Math.max(max, p);
                }
            }
        }

        return max;
    }
    }