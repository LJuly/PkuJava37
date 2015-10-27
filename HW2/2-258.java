public class Solution {
    public int addDigits(int num) {
     //if(num<10)
    // return num;
         //int a=num/10;  
         //int b=num%10;
    while(num/10>0)
         {
             int sum=0;
             while(num!=0)
            {
             sum+=num%10;
             num=num/10;
            }
             num=sum;
         }
        //if(sum<10)
        return num;
        //else 
    }
}