public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        //while(n>0)  //这个好像有问题。。
        for(int i=1;i<=32;i++){
        	cnt += (n & 1);
        	n = n>>>1;
        }
        return cnt;
        /* 没看到unsigned....
        if(n > 0) return(_cnt(n));
        if(n == 0) return 0;
        //最后考虑负数的情况 ----这个可以无视，没看到unisgned...
        cnt = _cnt(-n);
        //4位：-3：0011-->1101: 4+1-2
        cnt = 32+1-cnt;
        return cnt;
        */
    }
    /*
    private static int _cnt(int n){
    	int count = 0;
    	while(n>0){
    		count += n%2;
    		n /= 2;
    	}
    	return count;
    }
    */
}