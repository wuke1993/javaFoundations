package chap08.hospital;

public class Hospital
{
    private int hospitalId;  // 医院编号
    private String name;  // 医院名
    private String location;  //医院地址

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
