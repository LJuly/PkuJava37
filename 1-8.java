public class Solution {
    public int myAtoi(String str) {
    str=str.trim();
    if(str.length()<1)
    return 0;
    int i=0;
    //int j=0;
    boolean flag=false;
    boolean neg=false;
   // if(str.charAt(i)=='+')
   //{
    //i++;
   //}
    if(str.charAt(i)=='+')
       {
           flag=true;
           i++;
       }
   if(str.charAt(i)=='-')
    {
        neg=true;
        i++;
    }
    while(str.charAt(i)=='0')
          i++;
    if ( flag&&neg)
       return 0;
   // else if ()
    long result =0;
    for (int j=i;j<str.length();j++)
    {
        if(str.charAt(j)<'0'||str.charAt(j)>'9')
        break;
        else
        result=10*result+(str.charAt(j)-'0');
       if(!neg&&result>Integer.MAX_VALUE)
       return Integer.MAX_VALUE;
       if(neg&&-result<Integer.MIN_VALUE)
       return Integer.MIN_VALUE;
    }
    if (neg)
   result=-result;
    return (int) result;
    
    }
}