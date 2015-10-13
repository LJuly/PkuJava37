public class Solution 
{
    public int addDigits(int num) 
    {
        int sum=num;//记录结果
        while(num>9)//num大于9循环
        {
            sum=0;
            while(num>=1)//计算各位数字的和
            {
                sum+=num%10;
                num/=10;
            }
            num=sum;//将sum赋给num继续循环
        }
        return sum;//num小于10输出
    }
}