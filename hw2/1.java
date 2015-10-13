public class Solution
{
    public  int[] twoSum(int[] nums, int target) 
    {
    	int []index=new int[2];//记录index1、index2
    	
    	for(int i=0;i<nums.length;i++)//遍历数组，找到满足条件的两个数
    	{
    	//if(nums[i]<=target)//试图剪枝未果，因为输入可能有负数
    		//{
    			for(int j=i+1;j<nums.length;j++)
    			{
    				if(nums[i]+nums[j]==target)
    				{
    					index[0]=i+1;
    					index[1]=j+1;
    					break;
    				}
    			}
    	//	}
    		
    	}
    	
        return index;
    }
}