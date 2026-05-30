class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        String s2 = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Character.isLetter(arr[i])) {
                s2 = s2 + arr[i];
            }
        }
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                arr[i] = s2.charAt(idx);
                idx++;
            }
        }
        return new String(arr);
    }
}
