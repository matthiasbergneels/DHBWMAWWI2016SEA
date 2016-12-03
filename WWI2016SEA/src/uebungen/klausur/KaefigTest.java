package uebungen.klausur;

public class KaefigTest {

	public static void main(String[] args) {
		
		Kaefig meinKaefig = new Kaefig(20000);
		
		meinKaefig.setBewohner(new Hase("glitzer blau"));
		
		System.out.println(meinKaefig.getArtBewohner());

	}

}
