public class Solution 
{
    public boolean isUgly(int num)
    {
        if(num<=0)return false;//排除负数
        while(num%2==0)//将所有因子2除尽
            num/=2;
        while(num%3==0)//将所有因子3除尽
            num/=3;
        while(num%5==0)//将所有因子5除尽
            num/=5;
        if(num==1)return true;//若没有其他因子即为ugly number
        else return false;
    }
}