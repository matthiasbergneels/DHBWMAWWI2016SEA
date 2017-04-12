import java.io.File;

public class LaufwerkeAuflisten {

	public static void main(String[] args) {
		
		
		File[] laufwerkListe = File.listRoots();
		
		for(File laufwerk : laufwerkListe){
			System.out.println(laufwerk + " - existiert: " + laufwerk.exists());
		}
		
		
		File verzeichnis = new File("/test");
		System.out.println(verzeichnis + " - Verzeichnis: " + verzeichnis.isDirectory());
		
		for(File datei : verzeichnis.listFiles()){
			System.out.println(datei + " - Datei: " + datei.isFile());
		}
		
		File aktuelleVerzeichnis = new File(System.getProperty("user.dir"));
		System.out.println(aktuelleVerzeichnis + " - Verzeichnis: " + aktuelleVerzeichnis.isDirectory());
		
		for(File datei : aktuelleVerzeichnis.listFiles()){
			System.out.println(datei + " - Datei: " + datei.isFile());
		}
		
		System.out.println("\n\n\nAusgabe des gesamten Inhalts von " + aktuelleVerzeichnis);
		ausgebenVerzeichnisInhalt(aktuelleVerzeichnis);
		
		
		
		System.out.println("\n\n\nAusgabe des gesamten Inhalts von " + aktuelleVerzeichnis + "(mit Einrückung)");
		ausgebenVerzeichnisInhaltEingerueckt(aktuelleVerzeichnis, 0);
		
		
	}
	
	private static void ausgebenVerzeichnisInhalt(File datei){
		
		if(datei.isDirectory()){
			System.out.println("+ " + datei);
			for(File subDatei : datei.listFiles()){
				ausgebenVerzeichnisInhalt(subDatei);
			}
			
		}else{
			System.out.println("- " + datei);
		}
		
	}
	
	private static void ausgebenVerzeichnisInhaltEingerueckt(File datei, int einrueckungsLevel){
		
		if(datei.isDirectory()){
			ausgebenZeile(datei, einrueckungsLevel);
			for(File subDatei : datei.listFiles()){
				ausgebenVerzeichnisInhaltEingerueckt(subDatei, ++einrueckungsLevel);
			}
		}else{
			ausgebenZeile(datei, einrueckungsLevel);
		}
		
	}
	
	private static void ausgebenZeile(File datei, int einrueckungsLevel){
		String einrueckung = datei.isDirectory() ? "+" : "-";
		for(int i = 0; i<einrueckungsLevel; i++){
			einrueckung = "  " + einrueckung;
		}
		System.out.println(einrueckung + datei);
	}

}
