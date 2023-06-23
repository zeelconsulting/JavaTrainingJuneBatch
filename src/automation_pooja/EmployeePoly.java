package automation_pooja;


public class EmployeePoly extends company{
	

		
	//method overloading-function having same name but different parameters.
	public void EmployeeDetails(String EFN,String ELN,String EDO,int eAge,int eNo)
	{
		System.out.println("This is child class"+EFN + "    "+ ELN + "     "+EDO+"   "+eAge+"     "+eNo);
		
	}
	public void EmployeeDetails(String EFN,String ELN,String EDO)
	{
		System.out.println("This is child class"+EFN + "    "+ ELN + "     "+EDO);
		
	}

}
