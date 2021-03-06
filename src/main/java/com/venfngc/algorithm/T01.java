package com.venfngc.algorithm;

import com.sun.javafx.scene.control.behavior.TwoLevelFocusBehavior;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 * date
 * @author Peng
 */
public class T01 {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        int target = 9;

        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    System.out.print("符合的下标数组为: ");
                    System.out.println("[" + i + "]" + " " + "[" + j + "]");
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum soul");
    }

}




