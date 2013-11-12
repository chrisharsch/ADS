package uebung2;

public class Aufgabe3 {
	public static void main(String[] args) {
		String s = "kollosk";

		System.out.println(isPali(s));
	}

	public static boolean isPali(String s) {
		if (isPalidrom(s, 0, s.length() - 1)) {
			return true;
		}
		return false;
	}

	public static boolean isPalidrom(String s, int vorne, int hinten) {
		if (vorne == hinten || vorne == hinten + 1) {
			return true;
		} else if (vorne < hinten && s.charAt(vorne) == s.charAt(hinten)) {
			return isPalidrom(s, vorne + 1, hinten - 1);
		} else {
			return false;
		}
	}
}
