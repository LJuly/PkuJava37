public class Solution {
    public String addBinary(String a, String b) {
  StringBuffer rs= new StringBuffer();
  int i=a.length()-1;
  int j=b.length()-1;
  int k=0;
  int ac=0;
  int bc=0;
  int d=0;
  for (;i>=0||j>=0;i--,j--)
  {
      if(i>=0)
      ac=a.charAt(i)-'0';
      else ac=0;
      if(j>=0)
      bc=b.charAt(j)-'0';
      else bc=0;
     d=(ac+bc+k)%2;
     k=(ac+bc+k)/2;
    rs=rs.insert(0,d); 
  }
     if(k==1)
       {
         rs=rs.insert(0,'1');
          }
  return rs.toString();
    }
}