public class Solution 
{
    public void sortColors(int[] nums) 
    {
        int n=nums.length;
        int num_of_red=0,num_of_white=0,num_of_blue=0;
        for(int i=0;in;i++)统计各颜色个数
        {
            if(nums[i]==0)num_of_red++;
            if(nums[i]==1)num_of_white++;
            if(nums[i]==2)num_of_blue++;
        }
        for(int i=0;inum_of_red;i++)
            nums[i]=0;
        for(int i=num_of_red;inum_of_red+num_of_white;i++)
            nums[i]=1;
        for(int i=num_of_red+num_of_white;in;i++)
            nums[i]=2;
    }
}