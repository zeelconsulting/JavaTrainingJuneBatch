package encapsulationConcepts;

public class StudentEncap {
	
	// mark variables as Private
	// Create a getter method; create a setter method
	// getter method will retrieve the values for the variable
	// setter method will set the values for the variable
	
	// widely used during API automation
	
		private String fName;
		private String lName;
		private int rollNum;
		private boolean learningJava;
		private char batchName;
		
		private String userName;
		private String password;
		
		
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		public int getRollNum() {
			return rollNum;
		}
		public void setRollNum(int rollNum) {
			this.rollNum = rollNum;
		}
		public boolean isLearningJava() {
			return learningJava;
		}
		public void setLearningJava(boolean learningJava) {
			this.learningJava = learningJava;
		}
		public char getBatchName() {
			return batchName;
		}
		public void setBatchName(char batchName) {
			this.batchName = batchName;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	

}
