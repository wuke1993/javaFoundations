package chap07.task;
//****************************************************************************
//  P225 PP7.3
//****************************************************************************
import java.util.ArrayList;
import java.util.Scanner;

public class task1
{
	public static void main(String[] args)
	{
		int[] count = new int[10];
		
		count = reader();
		
		myprint(count);
	}
	// 计算各范围段内值的个数，存入长为10的数组中
	public static int[] reader()
	{
		int[] count1 = new int[10];
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		
		while(scan.hasNextInt())
		{
			temp = scan.nextInt();
			
			if(1 <= temp && temp <= 10)
				count1[0]++;
			else if(11 <= temp && temp <= 20)    
				count1[1]++;
			else if(21 <= temp && temp <= 30)    
				count1[2]++;
			else if(31 <= temp && temp <= 40)    
				count1[3]++;
			else if(41 <= temp && temp <= 50)    
				count1[4]++;
			else if(51 <= temp && temp <= 60)    
				count1[5]++;
			else if(61 <= temp && temp <= 70)    
				count1[6]++;
			else if(71 <= temp && temp <= 80)    
				count1[7]++;
			else if(81 <= temp && temp <= 90)    
				count1[8]++;
			else if(91 <= temp && temp <= 100)    
				count1[9]++;
		}
		 scan.close();
		return count1;
	}
	// 打印
	public static void myprint(int[] count)
	{
		String[] tag = {"1  - 10  |","11 - 20  |","21 - 30  |",
				        "31 - 40  |","41 - 50  |","51 - 60  |",
				        "61 - 70  |","71 - 80  |","81 - 90  |",
				        "91 - 100 |"};

		for(int i=0;i<10;i++)
		{
			System.out.print(tag[i]);
			for(int j=0;j<count[i];j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
// 1 43 5 6 45 88 99 1 23 44 65 22 33 66 88 43 12 3 2 *