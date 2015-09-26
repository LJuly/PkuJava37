public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Rows = new ArrayList<List<Integer>>();
		if(numRows == 0) return Rows;
		List<Integer> firstRow = new ArrayList<Integer>();  //第一行的数值
		//List<Integer> firstRow = new ArrayList<Integer>();  //第一行的数值
		firstRow.add(1);
		Rows.add(firstRow);
		if(numRows == 1) return Rows; //好像不用这个
		List<Integer> previousRow = new ArrayList<Integer>(); //用于记录前一行信息，用它计算下一行的数
		previousRow = firstRow;
		for(int i = 2; i <= numRows; i++){
			List<Integer> row = new ArrayList<Integer>();   //对于当前行的处理
			//List<Integer> row = new ArrayList<Integer>();   //对于当前行的处理
			row.add(1);   //第一个值为1
			//List<Integer> previousRow = new ArrayList<Integer>();
			//previousRow = Rows.get(i-2);
			for(int j = 1; j < i-1; j++){//对于当前行每一个值由上一行得出
				//row.add( previousRow.get(i-1) + previousRow.get(i) );
				row.add( previousRow.get(j-1) + previousRow.get(j) );
			}
			row.add(1);  //最后一个元素是1
			previousRow = row;
			Rows.add(row);
		}
		return Rows;
    }
}