package com.sososi;

import java.util.Arrays;

public class MaximumNumberofBalloons {
    /**
     * 1189. “气球” 的最大数量
     * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
     * <p>
     * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
     *
     * @param text
     * @return
     */
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[5];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case 'b':
                    counts[0]++;
                    break;
                case 'a':
                    counts[1]++;
                    break;
                case 'l':
                    counts[2]++;
                    break;
                case 'o':
                    counts[3]++;
                    break;
                case 'n':
                    counts[4]++;
                    break;
            }
        }
        counts[2] /= 2;
        counts[3] /= 2;
        return Arrays.stream(counts).min().getAsInt();
    }
}
