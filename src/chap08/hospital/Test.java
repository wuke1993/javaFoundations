package chap08.hospital;

public class Test
{
	public static void main(String[] args) 
	{
        Doctor doctor1 = new Doctor(001,"Li Ming","doctor");
        System.out.println(doctor1.toString());
        
        // Doctor doctor3 = new Staff(003,"Li Ping","doctor");  
        
        Staff doctor2 = new Doctor(002,"Li Jing","doctor"); // ����ת��
        System.out.println(doctor2.toString()); // ��̬
        
        //System.out.println(super.toString()); // ��̬�������治��ʹ��super��this�ؼ���
                                                // ԭ������ԣ�static�����ڶ������ǰ���Ѿ�������
        
        Nurse nurse = new Nurse(001,"Xiao��Mei","nurse");
        System.out.println(nurse.toString());
	}
}