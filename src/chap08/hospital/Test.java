package chap08.hospital;

public class Test
{
	public static void main(String[] args) 
	{
        Doctor doctor1 = new Doctor(001,"Li Ming","doctor");
        System.out.println(doctor1.toString());
        
        // Doctor doctor3 = new Staff(003,"Li Ping","doctor");  
        
        Staff doctor2 = new Doctor(002,"Li Jing","doctor"); // 向上转型
        System.out.println(doctor2.toString()); // 多态
        
        //System.out.println(super.toString()); // 静态方法里面不能使用super和this关键字
                                                // 原因很明显，static方法在对象产生前就已经存在了
        
        Nurse nurse = new Nurse(001,"Xiao　Mei","nurse");
        System.out.println(nurse.toString());
	}
}