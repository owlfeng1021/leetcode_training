/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */
class Solution {
    public void moveZeroes(int[] nums) {
        // 思路三
        // 和思路二一样 但是使用如果出现0就直接交换 而不进行赋值0操作
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != k) {
                    int temp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                    k++;
                } else {
                    k++;
                }
            }
        }
        // 思路二
        // 定义一个 k 指向是 [0...k)
        // 然后遍历 出现0的时候 就把i的位置移动到k的位置

        // int k=0;
        // for(int i=0 ;i< nums.length;i++){
        // if(nums[i]!=0){
        // nums[k]=nums[i];
        // k++;
        // }
        // }
        // //把k下标之后的数字变成0
        // for(int i=k ;i< nums.length;i++){
        // nums[i]=0;
        // }

        // 时间复杂度 o(n)
        // 空间复杂度 o(n)
        // 思路一 使用了其他的数组元素 其实是违反了规则
        // 第一步 把nums中不为零的数取到一个额外的数组
        // int[] element = new int[nums.length];
        // int num = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != 0) {
        // element[num] = nums[i];
        // num++;
        // }
        // }
        // // 第二布 对比nums的长度吧后面的长度补0
        // for(int y=num;y<nums.length-1;y++)
        // {
        // element[num+1]=0;
        // }
        // // 第三步 把已经排序好的数组放到nums上面
        // for(int x=0;x<len;x++)
        // {
        // nums[x]=element[x];
        // }
    }
}
