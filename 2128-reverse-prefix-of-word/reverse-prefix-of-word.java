class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) 
          return word;
        String part1 = word.substring(0, idx + 1);
        String part2 = word.substring(idx + 1);
        StringBuilder sb = new StringBuilder(part1);
        sb.reverse();
        return sb.toString() + part2;
    }
}