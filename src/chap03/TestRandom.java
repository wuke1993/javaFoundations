package chap03;

import java.util.Random;

/**
 * 
 * Title: TestRandom
 * Description: float nextFloat() int nextInt() int nextInt(int num)
 * @author wuke
 * @date 2017��4��6�� ����8:11:13
 */

public class TestRandom
{
    public static void main(String[] args)
    {
    	Random generator = new Random();
    	
    	int num1;
    	float num2;
    	
    	num1 = generator.nextInt();
    	System.out.println("A random integer: " + num1);
    	
    	num1 = generator.nextInt(10);
    	System.out.println("From 0 to 9: " + num1);
    	
    	num1 = generator.nextInt(10) + 1;
    	System.out.println("From 1 to 10: " + num1);
    	
    	num2 = generator.nextFloat();
    	System.out.println("A random float (between 0-1): " + num2);
    	
    	num2 = generator.nextFloat() * 6;
    	System.out.println("From 0.0 to 5.999999: " + num2);
    	num1 = (int)num2 + 1;
    	System.out.println("From 1 to 6: " + num1);
    } 
}
