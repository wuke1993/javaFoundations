package chap05;

import java.util.Scanner;

/**
 * Title: Gcd
 * Description: greatest common divisor
 * @author wuke
 * @date 20170406 20:23:52
 */

public class Gcd
{
	public static void main(String[] args)
	{
		int num1;
		int num2;

		Scanner scan = new Scanner(System.in);

		num1 = scan.nextInt();
		num2 = scan.nextInt();

		System.out.print(gcd(num1, num2));
	}

	public static int gcd(int a, int b)
	{
		if (a % b == 0)
			return b;
		else
			return gcd(b, a % b);
	}
}