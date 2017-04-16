package chap03;
 
/**
 * 
 * Title: Test3String
 * Description: char charAt(int index)      int compareTo(String str)
 * @author wuke
 * @date 2017��4��6�� ����8:10:00
 */
public class TestString
{
    public static void main(String[] args)
    {
    	String str = "Good good study,day day up!";
    	
    	System.out.println(str.charAt(3));
    	
    	System.out.println(str.compareTo("Good good study,day day up!"));
    	System.out.println(str.compareTo("A apple!"));
    	System.out.println(str.compareTo("Zzzzzz"));
    	
    	System.out.println(str.replace('o', 'O'));
    	
    	System.out.println(str.substring(3, 8));
    	
    	System.out.println(str.toLowerCase());
    	
    	System.out.println(str.concat("bulabula"));
    }
}
