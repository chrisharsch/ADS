package uebung2;

public class Aufgabe3 {
	public static void main(String[] args) {

		System.out.println(isPali("ABBA"));
		System.out.println(isPali("POP"));
		System.out.println(isPali("PERPEP"));
		System.out.println(isPali("LAGERREGAL"));
	}
	
	/**
	 * 
	 * @param s ist das Wort das überprüft werden soll
	 * @return	es wird ein boolean zurück gegeben der sagt ob es ein Pallindrom ist oder nicht
	 */
	
	public static boolean isPali(String s) {
		if (isPalidrom(s, 0, s.length() - 1)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param s	Ist der String der von der Funktion isPali übergeben wird
	 * @param vorne	ist das erste Zeichen des Strings
	 * @param hinten ist das letzte Zeichen des Strings
	 * @return
	 */
	
	public static boolean isPalidrom(String s, int vorne, int hinten) {
		if (vorne == hinten || vorne == hinten + 1) {
			return true;
		} else if (vorne < hinten && s.charAt(vorne) == s.charAt(hinten)) {
			System.out.println(s.subSequence(vorne, hinten+1));
			return isPalidrom(s, vorne + 1, hinten - 1);
		} else {
			return false;
		}
	}
}
