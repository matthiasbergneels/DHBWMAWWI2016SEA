package kapitel7.clone;

public class Cloner {

	public static void main(String[] args) {
		
		Schaf dolly = new Schaf("Dolly", 5);
		
		try {
			Schaf gabi = dolly.clone();
			
			System.out.println(dolly);
			System.out.println(gabi);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
