package kapitel3;

public class ArrayBeispiele {

	public static void main(String[] args) {
		
		
		int[] zahlenliste = new int[5];
		
		zahlenliste[0] = 15;
		zahlenliste[3] = 26;
		zahlenliste[4] = 128;
		
		System.out.println(zahlenliste[4]);
		System.out.println(zahlenliste[2]);
		System.out.println(zahlenliste.length);
		//System.out.println(zahlenliste[5]);
		
		
		int[] zahlenliste2 = {17, 1892, 8271, 882, 12, 17};
		
		System.out.println(zahlenliste2[2]);
		
		System.out.println(zahlenliste2.length);
		
		
		String[][] tictactoeFeld = new String[3][3];
		
		tictactoeFeld[1][1] = "X";
		tictactoeFeld[0][1] = "O";
		tictactoeFeld[0][2] = "X";
		
		
		String[][] saetze = new String[5][];
		
		saetze[0] = new String[2];
		
		saetze[0][0] = "Hallo";
		saetze[0][1] = "Welt";
		
		saetze[1] = new String[4];
		
		saetze[1][0] = "Hallo";
		saetze[1][1] = "ihr";
		saetze[1][2] = "lieben";
		saetze[1][3] = "Studierenden";
		
		System.out.println(saetze.length);
		System.out.println(saetze[1].length);
		
		String[][] saetze2 = {{"Hallo", "Welt"}, {"Hallo", "ihr", "lieben", "Studierenden"}};

	}

}
