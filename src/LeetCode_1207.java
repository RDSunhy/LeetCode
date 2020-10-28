import java.util.*;

/**
 * 1207. 独一无二的出现次数
 *
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 *
 * 学习到 :
 * HashMap 中的 getOrDefault 方法
 * 存在Key 则返回value 否则返回传入的defaultValue参数
 * 利用HashSet 元素不可重复的特性 如果每个元素出现次数不同 则不会有重复有
 */
class LeetCode_1207 {

    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = -2;
        arr[3] = -3;
        arr[4] = -6;
        arr[5] = -6;

        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int elem : arr)
            counter.put(elem, counter.getOrDefault(elem, 0) + 1);

        return counter.size() == new HashSet<>(counter.values()).size();
    }
}
