public class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> rs=new ArrayList();
       if(rowIndex<0)
       return rs;
       rs.add(1);
       //List<Integer> list0=new ArrayList<Integer>(rs);
       for(int i=1;i<=rowIndex;i++)
       {
          //rs.clear();
          //rs.add(1);
          //List<Integer> list0=rs.get(rs.size()-1);
          for(int j=rs.size()-2;j>=0;j--)
           //for (int j=1;j<i;j++)
           {
               rs.set(j+1,rs.get(j)+rs.get(j+1));
               //rs.add(list0.get(j)+list0.get(j-1));
           }
           rs.add(1);
           //list0.clear();
           //list0.addAll(rs);
       }
       return rs;
    }
}