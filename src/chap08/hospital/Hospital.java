package chap08.hospital;

public class Hospital
{
    private int hospitalId;  // ҽԺ���
    private String name;  // ҽԺ��
    private String location;  //ҽԺ��ַ

	public int getId()
	{
		return hospitalId;
	}

	public void setId(int id)
	{
		this.hospitalId = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}
    
}
