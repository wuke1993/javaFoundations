package chap03;

public class WrongUseOfDouble
{
    public static void main(String[] args)
    {
    	double num = 1.0;
    	// float num = 1.0F;
    	
    	while (num != 0.0) // can't stop
    	{
    		num = num - 0.1;
    		// num = num -0.1F;
    		
    		System.out.println(num);
    	}
    	System.out.println("Finsh!");
    }
}
