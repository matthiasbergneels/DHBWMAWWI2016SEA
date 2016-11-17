package kapitel5.assoziationen;

public class BeispielFamilie {

	public static void main(String[] args) {
		
		
		Mann karl = new Mann("Karl");
		Frau gabi = new Frau("Gabi");
		
		
		// verheiraten
		gabi.setEhemann(karl);
		karl.setEhefrau(gabi);

		
		Mann klaus = new Mann("Klaus");
		
		gabi.setEhemann(klaus);
		klaus.setEhefrau(gabi);
		
		Kind manfred = new Kind("Manfred", klaus, gabi);
		
		System.out.println(manfred.getVater().getName());

	}

}
