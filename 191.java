public class Solution 
{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) 
    {
        int count=0;//计算1的个数
        //long n_long=n;//类型转换
        while(n!=0)
        {
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
//用位运算的方法可以极大的降低运行时间 = =!