public class Solution {
    public int lengthOfLastWord(String s) {
    if(s==null)
    return 0;
    s=s.trim();
    String[] array=s.split(" ");
    //int len=strarray.length;
    //int i=0;
    //for(int i=len;i>=0;i--)
    //{
         //if(strarray[i].length()>0)
    int len=array[array.length-1].length();
    return len;
    //} 
    }
}