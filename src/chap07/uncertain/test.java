package chap07.uncertain;
//********************************************************************
//  变长参数表，比重载强大好多
//********************************************************************
public class test 
{

	public static void main(String[] args)
	{
		int[] list1 = {1,4,6,8,9};
		int[] list2 = {2,4,6,8,10,1,2,3};
		
		System.out.println(average(list1));
		System.out.println(average(list2));
		
		mult(22,"XiaoMing",170.0,80.0,60.9);
		mult(23,"LiJing",175.0,86.0);
	}
    public static double average(int ...  list) // list整形数组
    {
    	double result = 0.0;
    	if(list.length != 0)
    	{
    		int sum = 0;
    		for(int num : list)
    			sum += num;
    		result = (double)sum/list.length;
    	}
    	return result;
    }
    // 变长个数的参数必须放在后面，且一个方法不能含有两个变长的参数
    public static void mult(int count,String name,double ... num) 
    {
    	System.out.print(count + "  ");
    	System.out.print(name + "  ");
    	for(double temp : num)
    		System.out.print(temp + "  ");
    	System.out.println();
    }
}
