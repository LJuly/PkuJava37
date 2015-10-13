public class Solution 
{
    public int reverse(int x) 
    {
        long long_r_num=0;//用一个long型数记录初始的翻转数
        int temp;
        while(x!=0)//求出翻转数
        {
        	long_r_num*=10;
        	temp=x%10;
        	long_r_num+=temp;
        	x/=10;
        }
        if(long_r_num<-2147483648||long_r_num>2147483647)long_r_num=0;//若溢出int范围返回0
        int r_num=(int) long_r_num;//强制类型转换
        return r_num;
    }
}