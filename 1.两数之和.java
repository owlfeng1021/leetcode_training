import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {

        /**
         * 这是我没有想过的解法 思路就是hash的方式 把数组放到map里面使用hash的方式
           思路已经整理好了 差不多就是遍历每一个数 
           然后把它放到map里面 然后让结果减去后面的数
           如果结果得到是map的key就可以得到两个数的和
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };

            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };

        /**
         * 下面是最简单的解法 就是使用双重for循环 破解
         */
        // for(int i=0;i<nums.length;i++){
        // for(int y=i+1;y<nums.length;y++)
        // {
        // if((nums[i]+nums[y])==target)
        // {
        // return new int[]{i,y};
        // }
        // }
        // }
        // return new int[]{-1,-1};
        
    }
}
