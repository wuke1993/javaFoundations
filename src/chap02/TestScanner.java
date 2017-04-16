package chap02;

import java.util.Scanner;

public class TestScanner
{
	public static void main(String[] args)
	{
		String str1;
		String str2;
		Boolean b;
		//Byte by;
		//int i;
		//double d;
				
		Scanner scan = new Scanner(System.in);

		str1 = scan.next();
		System.out.println(str1);
		
		str2 = scan.nextLine();
		System.out.println(str2);
		
		b = scan.nextBoolean();
		System.out.println(b);		
	}
}
