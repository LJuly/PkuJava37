public class Solution 
{
    public int singleNumber(int[] nums) 
    {   
        int single=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            single=single^nums[i+1];
        }
        return single;
    }
}
//采用将所有数进行按位异或^的方法
//原理是^运算满足交换律 且 0^a=a
//因此 a1^a2^a3.....^an可得唯一的singlenumber