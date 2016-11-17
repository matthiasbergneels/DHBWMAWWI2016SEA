package kapitel4;

public class SwitchBeispiel {

	public static void main(String[] args) {
		
		int note = 19;
		
		switch (note) {
			default:
				System.out.println("Keine gueltige Note");
				break;
			case 1: 
				System.out.println("Sehr gut");
				break;
			case 2: 
				System.out.println("gut");
				break;
			case 3: 
				System.out.println("befriedigend");
				break;
			case 4: 
				System.out.println("ausreichend");
				break;
			case 5: 
				System.out.println("mangelhaft");
				break;
			
			
			
		}
		
		

	}

}
