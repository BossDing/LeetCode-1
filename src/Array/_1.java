package Array;

import org.junit.Test;

import java.util.HashMap;

public class _1 {
    @Test
    public void Test() {

    }


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);
        for (int i = 0; i < nums.length; i++) {
            int element = target - nums[i];
            if (map.containsKey(element) && map.get(element) != i)
                return new int[]{i, map.get(element)};
        }
        throw new IllegalArgumentException("不存在！");
    }
}
