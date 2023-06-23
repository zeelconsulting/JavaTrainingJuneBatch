package automation_pooja;


public class company {

	String CName;
	int CTotalEmp;
	String CDepartment;
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public int getCTotalEmp() {
		return CTotalEmp;
	}
	public void setCTotalEmp(int cTotalEmp) {
		CTotalEmp = cTotalEmp;
	}
	public String getCDepartment() {
		return CDepartment;
	}
	public void setCDepartment(String cDepartment) {
		CDepartment = cDepartment;
	}
	public void EmployeeDetails(String EFN,String ELN,String EDO)
	{
		System.out.println("This is Parent class "+EFN + "    "+ ELN + "     "+EDO);
		
	}
}
