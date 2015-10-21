
package wzcontrol;

public class Test1 {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		
	}
public boolean isWon(int Posx, int Posy, String ico)
{
boolean flag=false;
String [][] board=new String [15][15];
int ch1=1;
int count1=1;
//for (int i=0;i<5;i++)
{
	while(board[Posx][Posy]==board[Posx+i][Posy])
		count1++;
	while(board[Posx][Posy]==board[Posx-i][Posy])
		count1++;
}
if(count1>=5)
{
	flag=true;//横向比较；
}
int cv1=1;
package wzcontrol;

public class Test1 {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		
	}
public boolean isWon(int Posx, int Posy, String ico)
{
boolean flag=false;
String [][] board=new String [15][15];
int ch1=1;
int count1=1;
//for (int i=0;i<5;i++)
{
	while(board[Posx][Posy]==board[Posx+ch1][Posy])
		ch1++;
		count1++;
	while(board[Posx][Posy]==board[Posx-ch1][Posy])
		ch1++;
		count1++;
}
if(count1>=5)
{
	flag=true;//横向比较；
}
int cv1=1;
int count2=1;
//for(int i=0;i<5;i++)
{
	while(board[Posx][Posy]==board[Posx][Posy+cv1])
		cv1++;
		count2++;
	while(board[Posx][Posy]==board[Posx][Posy-cv1])
		cv1++;
		count2++;
}
if(count2>=5)
{
	flag=true;//纵向比较；
}
int ci1=1;
int count3=1;
//for (int i=0;i<5;i++)
{
	while(board[Posx][Posy]==board[Posx+ci1][Posy+ci1])
		ci1++;
		count3++;
	while(board[Posx][Posy]==board[Posx-ci1][Posy-ci1])
		ci1++;
		count3++;
}
if(count3>=5)
{
	flag=true;//判断斜向一三象限方向；
}
int ci2=1;
int count4=1;
//for(int i=0;i<5;i++)
{
	while(board[Posx][Posy]==board[Posx-ci2][Posy+ci2])
		ci2++;
		count4++;
	while(board[Posx][Posy]==board[Posx+ci2][Posy-ci2])
		ci2++;
		count4++;
}
if(count4>=5)
{
	flag=true;//判断斜向二四象限方向；
}
	return flag;
}

}
