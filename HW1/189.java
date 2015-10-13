public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int [] temp = new int[len];
        //0 1 2 3 4 -2-> 3 4 0 1 2
        for(int i=0; i<len; i++){
            temp[i] = nums[(10*len-k+i)%len];
			//上一行在投机取巧哈~~~正确写法是：
			/*
			int p = i-k;
			while(p<0) p += len
			*/
        }
        for(int i=0; i<len; i++){
            nums[i] = temp[i];
        }
    }
}