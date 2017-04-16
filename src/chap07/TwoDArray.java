package chap07;

public class TwoDArray 
{

	public static void main(String[] args)
	{
		int[][] table = new int[5][10];
		
		//初始化
		for(int row=0;row<table.length;row++)
		{
			for(int col=0;col<table[row].length;col++)
			{
				table[row][col] = row * 10 + col;
			}
		}
		//打印数组
		for(int row=0;row<table.length;row++)
		{
			for(int col=0;col<table[row].length;col++)
			{
				System.out.print(table[row][col] + "  ");
			}
			System.out.println();
		}
	}

}
