public class Solution {
    public int reverse(int x) {
      boolean flag=false;
      if(x==0)
      return x;
      if(x<0)
      {
          flag=true;
          x=-x;
      }
      long sum=0;
      while(x>0)
      {
          sum=sum*10+x%10;
          if((!flag&&sum>=Integer.MAX_VALUE)||(flag&&-sum<=Integer.MIN_VALUE))
          return 0;
          //Integer.MAX_VALUE;
          //if(flag&&-sum<Integer.MIN_VALUE)
          //sum=0;
          //return 0;//Integer.MIN_VALUE;
          x=x/10;
      }
      if(flag)
       sum=-sum;
     return (int)sum;
    }
}