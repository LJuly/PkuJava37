public class Solution 
{
    public boolean isHappy(int n) 
    {
        int[]sum_sq=new int[100];//记录平方和
        int temp=0;
        sum_sq[0]=n;
        for(int i=1;n!=1;i++)
        {
            while(n>=1)
            {  
                temp+=(n%10)*(n%10);
                n/=10;
            }
            n=temp;
            if(n==1)return true;
            for(int j=0;j<i;j++)
                if(temp==sum_sq[j])return false;
            sum_sq[i]=temp;
            temp=0;
        }
		return true;
    }
}