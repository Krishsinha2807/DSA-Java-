class Solution {
    public int[] scoreValidator(String[] events) {
        int counter=0;
        int score =0;
        int i =0;
        while(counter!=10 && i!=events.length){
            if(events[i].equals("W")){
                counter++;
            }
            else if(events[i].equals("WD")){
                score++;
            }
            else if(events[i].equals("NB")){
                score++;
            }
            else{
            score = score + Integer.parseInt(events[i]);
            }
            i++; 
        }
        return new int[]{score, counter};
        
    }
}