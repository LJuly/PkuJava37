public class Solution 
{
    public int lengthOfLastWord(String s) 
    {
    	int sum=0;
    	int n=s.length();
    	//char [] s_arr=s.toCharArray();//将string s变成char数组s_arr
		for(int i=n-1;i>=0;i--)
		{	
			if(s.charAt(i)==' ')
			{
				if(sum!=0)break;
				else sum--;
			}
			sum++;
			//System.out.println(s.charAt(i));
    	}
		return sum;
    }
}