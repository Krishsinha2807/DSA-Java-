class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evensum = 0, oddsum = 0;
        for (int i = 1; i < n*2; i=i+2) {
                oddsum += i;
        }
               for (int i = 2; i <= n*2; i=i+2) {
                evensum += i;
        }
        return gcd(evensum, oddsum);
    }

    public int gcd(int evensum, int oddsum) {
        while (oddsum!= 0) {
            int t = oddsum;
            oddsum = evensum % oddsum;
            evensum = t;
        }
        return evensum ;
    }
}
