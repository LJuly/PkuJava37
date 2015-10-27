public class Solution {
    public
    char turn (char c)
       {
           if (c>='A'&&c<='Z')
            return (char) (c-'A'+'a');
           else return (char)c;//把大写转换成小写
       }
    boolean isPalindrome(String s){
       if(s==null||s.length()==0)
       {
           return true;
       }
       //low++;
       //else if
       int low=0;
       int high=s.length()-1;
       while(low<high)
       {
           if (!((s.charAt(low)>='a'&&s.charAt(low)<='z')||(s.charAt(low)>='A'&&s.charAt(low)<='Z')||(s.charAt(low)>='0'&&s.charAt(low)<='9')))//判断是否为字母、数字
           {
               low++;
           }
           else if (!((s.charAt(high)>='a'&&s.charAt(high)<='z')||(s.charAt(high)>='A'&&s.charAt(high)<='Z')||(s.charAt(high)>='0'&&s.charAt(high)<='9')))//判断是否为字母、数字
           {
               high--;
           }
           else if(turn(s.charAt(low))!=turn(s.charAt(high)))//判断回文字母，要把大写字母转换成小写字母
           {
               return false;
           }
           else
           {
               low++;
               high--;
           }
       }
       return true;
    }
}