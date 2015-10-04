public class Solution {
    public List<List<Integer>> generate(int numRows) {
     //list<Integer> arr= new list<Integer>();
      List<List<Integer>> rs=new ArrayList<List<Integer>>();
     if (numRows<=0)
     return rs;
     List<Integer> ar= new ArrayList();
     ar.add(1);
     rs.add(ar);
    for(int i=2;i<=numRows;i++)
     {
          List<Integer> arr= new ArrayList();
          arr.add(1);
          List<Integer> ary= rs.get(rs.size()-1);
         //for(int j=ar.size()-2;j>=0;j--)
         for(int j=1;j<i-1;j++)
         {
             //arr.set(j+1,ary.get(j)+ary.get(j+1));
             arr.add(ary.get(j-1)+ary.get(j));
         }   
         arr.add(1);
         rs.add(arr);
     }
     return rs;
    }
}