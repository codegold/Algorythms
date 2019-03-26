package MyTests;

import java.util.Arrays;

public class GreedyTestMem {
    public static void main(String[] args) {
        int[] nums = {23, 54, 67, 93};
        System.out.println(greedyTest(nums));
    }

    public static String greedyTest(int[] nums) {
        Arrays.sort(nums);
        String s ="";
        for(int i = nums.length -1; i >= 0; i--)
            s += nums[i];
        return s;
    }
}
