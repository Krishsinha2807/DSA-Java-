import java.util.Random;

class Solution {

    public int[] sortArray(int[] nums_30) {
        quicksort(nums_30, 0, nums_30.length - 1);
        return nums_30;
    }

    public void quicksort(int[] nums_30, int low_30, int high_30) {

        if (low_30 >= high_30) {
            return;
        }

        int pivot_30 = nums_30[
            low_30 + (int)(Math.random() * (high_30 - low_30 + 1))
        ];

        int lt_30 = low_30;
        int i_30 = low_30;
        int gt_30 = high_30;

        while (i_30 <= gt_30) {

            if (nums_30[i_30] < pivot_30) {

                int temp_30 = nums_30[lt_30];
                nums_30[lt_30] = nums_30[i_30];
                nums_30[i_30] = temp_30;

                lt_30++;
                i_30++;

            } else if (nums_30[i_30] > pivot_30) {

                int temp_30 = nums_30[i_30];
                nums_30[i_30] = nums_30[gt_30];
                nums_30[gt_30] = temp_30;

                gt_30--;

            } else {

                i_30++;
            }
        }
        quicksort(nums_30, low_30, lt_30 - 1);
        quicksort(nums_30, gt_30 + 1, high_30);
    }
}