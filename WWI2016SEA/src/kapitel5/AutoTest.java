package kapitel5;

public class AutoTest {

	public static void main(String[] args) {
		
		
		System.out.println("Es gibt " + Auto.getAutozaehler() + " Autos!");
		
		
		Auto meinAuto;
		
		meinAuto = new Auto((byte)4, 240, "gruen", false);
		
		/*
		meinAuto.anzahlReifen = 4;
		//meinAuto.farbe = "gruen";
		meinAuto.leistung = 240;
		meinAuto.laufleistung = 125234.34;
		*/
		
		Auto deinAuto = new Auto((byte)3, 523, "Pink", true);
		
		/*
		deinAuto.anzahlReifen = 5;
		deinAuto.farbe = "Pink";
		deinAuto.leistung = 523;
		deinAuto.schiebedach = true;
		*/ 
		
		System.out.println("Kilometerstand von meinem Auto: " + meinAuto.getLaufleistung());
		System.out.println("Farbe von meinem Auto: " + meinAuto.getFarbe());
		System.out.println("Farbe von deinem Auto: " + deinAuto.getFarbe());
		
		
		meinAuto.fahren(25.67);
		deinAuto.fahren(13.89);
		meinAuto.fahren(2598.67);
		meinAuto.fahren(782.67);
		meinAuto.fahren(7892.67);
		meinAuto.fahren(250922.67);
		
		
		// ich böser böser Mensch
		//meinAuto.laufleistung = 33000.32;
		
		
		
		System.out.println("Kilometerstand von meinem Auto: " + meinAuto.getLaufleistung());
		
		
		new Auto("rot");
		new Auto("rot");
		new Auto("rot");
		new Auto("rot");
		new Auto("rot");
		new Auto("rot");
		
		System.out.println("Es gibt " + Auto.getAutozaehler() + " Autos!");
		
		meinAuto = null;
		deinAuto = null;
		
		
		System.gc();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Es gibt " + Auto.getAutozaehler() + " Autos!");
	}

}
