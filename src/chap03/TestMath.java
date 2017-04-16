package chap03;

/**
 * 
 * Title: TestMath
 * Description: static double ceil(double num); static double floor(double num); 
 *              static double exp(double power); static double exp(double num,double power); 
 *              static double random(); static double sqrt(double num)
 * @author wuke
 * @date 2017年4月6日 下午8:13:06
 */

public class TestMath
{
    public static void main(String[] args)
    {
    	double num1 = 12.32946632;
    	System.out.println(Math.floor(num1));
    	System.out.println(Math.ceil(num1));
    	
    	double randomNum = Math.random();
    	System.out.println(randomNum);
    }
}
