/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */
class Solution {
    public int reverse(int x) {
        
        // long r = 0;
		// while(x != 0){
		// 	r = r*10 + x%10;
		// 	x /= 10;
		// }
		// if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
		// 	return (int)r;
		// else
        // 	return 0;
        
       // 上面是标准答案 下面是我写的 效率还高一些
        long target = 0;
        int count = 0;
        int temp=x;
        // 先计算x的位数
        while (x != 0) {
            x = x / 10;
            count++;
        }
        // 对target 进行赋值 
        // x%10 是x的个位数 
        // 然后x/10 就把x的个位数 放到了target的第一位 如果个位数为0
        // target就为0 而下一次取值target不会发生改变 就满足了上述需求
        for (int y = 0; y < count; y++) {
            target = target * 10 + temp % 10;
            temp = temp / 10;
            
        }
        if(target >= Integer.MIN_VALUE && target <= Integer.MAX_VALUE)
			return (int)target;
		else
			return 0;  
    }
}
