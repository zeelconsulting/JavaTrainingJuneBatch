package encapsulationConcepts;

public class TestEncap {

	public static void main(String[] args) {
		
		
		StudentEncap sde = new StudentEncap();
		
		sde.setfName("John");
		sde.setlName("Doe");
		sde.setRollNum(1);
		sde.setLearningJava(true);
		sde.setBatchName('A');
		
		
		System.out.println(sde.getfName());
		System.out.println(sde.getlName());
		System.out.println(sde.getRollNum());
		System.out.println(sde.isLearningJava());
		System.out.println(sde.getBatchName());
		

	}

}
