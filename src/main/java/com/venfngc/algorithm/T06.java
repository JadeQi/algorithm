package com.venfngc.algorithm;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 输入: 123
 * 输出: 321
 *
 * @author Peng
 */
public class T06 {
    public int reverse(int x) {
        long res = 0;
        //for循环先执行布尔表达式,执行一次循环后更新循环控制变量.
        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
            System.out.println(x+" res:"+res);
        }

        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        T06 solution = new T06();
        //直接调用方法输出
        System.out.println(solution.reverse(123)+"count");
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(100));
        System.out.println(solution.reverse(1000000003));
    }
}
