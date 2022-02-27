package com.sososi;

/**
 * 553. 最优除法
 * 给定一组正整数，相邻的整数之间将会进行浮点除法操作。例如， [2,3,4] -> 2 / 3 / 4 。
 *
 * 但是，你可以在任意位置添加任意数目的括号，来改变算数的优先级。你需要找出怎么添加括号，才能得到最大的结果，并且返回相应的字符串格式的表达式。你的表达式不应该含有冗余的括号。
 *
 */
public class OptimalDivision {

    /**  数学 + 贪心
     * 将最优解分解为x/y,理论上得到最大值，应该要x分子越大，y分子越小
     * 全部为除法操作，将第一个作为分母，则分母最大，后面所以会不断进行除法运算，则分子最小
     * @param nums
     * @return
     */
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(nums[i]);
            if (i + 1 < n) {
                stringBuilder.append("/");
            }
        }
        if (n > 2) {
            stringBuilder.insert(stringBuilder.indexOf("/") + 1, "(");
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }

    public String optimalDivision1(int[] nums) {
        return "";
    }
}
