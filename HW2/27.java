public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int pointer = 0;
        int temp = 0;
        while(pointer != len){
            if(nums[pointer] != val) nums[temp++] = nums[pointer];
            pointer++;
        }
        return temp;
    }
}