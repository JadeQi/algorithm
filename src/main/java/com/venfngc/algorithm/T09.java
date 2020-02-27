package com.venfngc.algorithm;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 输入: 121
 * 输出: true
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * <p>
 * https://leetcode-cn.com/problems/palindrome-number/
 *
 * @author Peng
 */
public class T09 {
    public boolean isPalindrome(int x) {
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。

        int Number = 0;
        while (x > Number) {
            Number = Number * 10 + x % 10;
            x /= 10;
        }

        return x == Number || x == Number / 10;
    }


    public static void main(String[] args) {
        T09 solution = new T09();
        System.out.println(solution.isPalindrome(111));
        System.out.println(solution.isPalindrome(1121));
        System.out.println(solution.isPalindrome(-11));
        System.out.println(solution.isPalindrome(3443));

    }

}
