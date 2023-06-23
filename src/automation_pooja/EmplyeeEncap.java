package automation_pooja;


public class EmplyeeEncap {

	// Encapsulation is a process for rapping up of data into single unit 
	//we use private keyword so that it cannot be access outside the class
	//getter and setter methods is created
	
	private String EFirstN;
	private String ELastN;
	private String EDOB;
	private int EAge;
	private int ENo;
	
	public String getEFirstName() {
		return EFirstN;
	}
	public void setEFirstName(String eFirstName) {
		EFirstN = eFirstName;
	}
	public String getELastName() {
		return ELastN;
	}
	public void setELastName(String eLastName) {
		ELastN = eLastName;
	}
	public String getEDOB() {
		return EDOB;
	}
	public void setEDOB(String eDOB) {
		EDOB = eDOB;
	}
	public int getEAge() {
		return EAge;
	}
	public void setEAge(int eAge) {
		EAge = eAge;
	}
	public int getENo() {
		return ENo;
	}
	public void setENo(int eNo) {
		ENo = eNo;
	}
	
	
}
