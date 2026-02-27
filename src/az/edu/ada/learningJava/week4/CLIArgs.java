package az.edu.ada.learningJava.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CLIArgs {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 2, 4, 3, 4};
        // 1 2 3 3 4 4 5 5
        System.out.println(findMedian(arr));
    }

    public static int calcSum(int... nums){
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return sum;
    }

    public static int findMin(int... nums){
        int min = nums[0];
        for (int num : nums){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int... nums){
        int max = nums[0];
        for (int num : nums){
            if (num > max) max = num;
        }
        return max;
    }

    public static double findMedian(int... nums){
        Arrays.sort(nums);
        if (nums.length % 2 == 1){
            return nums[nums.length / 2];
        } else {
            return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        }
    }
}
