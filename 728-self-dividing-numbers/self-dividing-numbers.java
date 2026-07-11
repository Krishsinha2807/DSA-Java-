import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            int t = i;
            boolean flag = true;
            while (t > 0) {
                int d = t % 10;
                if (d == 0 || i % d != 0) {
                    flag = false;
                    break;
                }
                t = t / 10;
            }
            if (flag) list.add(i);
        }
        return list;
    }
}

   