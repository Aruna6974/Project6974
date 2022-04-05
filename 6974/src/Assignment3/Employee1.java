package Assignment3;

public class Employee1 
{
	private int  EmpId;
	private String Empname;
	private String Empaddress;
	private Double Empsalary;
	
	public Employee1(int empId,String empname,String empaddress,double empsalary)
	{
		super();
		EmpId=empId;
		Empname=empname;
		Empaddress=empaddress;
		Empsalary=empsalary;
	}
	public String GetEmployee1Details()
	{
		return "EmpId="+EmpId+ ",Empname="+ Empname + ",Empaddress="+ Empaddress + ",Empsalary="+Empsalary;
		
    }
	public int getEmpId()
	{
		return EmpId;
	}
	public void setEmpId(int empId)
	{
		EmpId=empId;
	}
	public String getEmpname()
	{
		return Empname;
	}
	public void setEmpname(String empname)
	{
		Empname=empname;
	}
	public String getEmpaddress()
	{
		return Empaddress;
	}
	public void setEmpaddress(String empaddress)
	{
		Empaddress=empaddress;
	}
	public Double Empsalary()
	{
		return Empsalary;
	}
	public void setEmpsalary(double empsalary)
	{
		Empsalary=empsalary;
	}


}
