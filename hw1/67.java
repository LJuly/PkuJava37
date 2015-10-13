public class Solution 
{
    public String addBinary(String a, String b) 
    {
//    	int dec_a=Integer.parseInt(a,2);
//    	int dec_b=Integer.parseInt(b,2);
//    	int dec_sum=dec_a+dec_b;
//    	String bin_sum=Integer.toBinaryString(dec_sum);
    	//System.out.println(bin_sum);
    	int length_a=a.length();
    	int length_b=b.length();
    	int new_length=0;
    	if(length_a>length_b)new_length=length_a+1;
    	if(length_a<=length_b)new_length=length_b+1;
    	//if(length_a==length_b)new_length=length_a+1;
    	char[] sum_array=new char[new_length];
    	sum_array[0]='0';
    	for(int i=new_length-1;i>=0;i--)
    	{
    		length_b--;length_a--;
    		if(length_b>=0&&length_a>=0)sum_array[i]=(char) (a.charAt(length_a)+b.charAt(length_b)-48);
    		if(length_a>=0&&length_b<0)sum_array[i]=(char)a.charAt(length_a);
    		if(length_b>=0&&length_a<0)sum_array[i]=(char)b.charAt(length_b);
       	}
    	for(int i=new_length-1;i>=1;i--)
    	{
    		if(sum_array[i]=='2'||sum_array[i]=='3')
    		{
    			sum_array[i]-=2;
    			sum_array[i-1]++;
    		}
    	}
    	String sum_str;
    	char[] short_sum_array=new char[new_length-1];
    	for(int i=0;i<new_length-1;i++)
    	{
    		short_sum_array[i]=sum_array[i+1];
    	}
    	if(sum_array[0]!='0')sum_str=String.valueOf(sum_array);
    	else sum_str=String.valueOf(short_sum_array);
		return sum_str;
        
    }
}