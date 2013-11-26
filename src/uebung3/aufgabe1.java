package uebung3;

public class aufgabe1 {
	final static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {
		System.out.println(binarysearch(1));
	}

	public static int binarysearch(int wert) {
		return binarysearch(wert, 0, a.length);
	}

	public static int binarysearch(int wert, int links, int rechts) {
		if (links <= rechts) {
			int mitte = links + (rechts - links) / 2;

			if (a[mitte] < wert) {
				return binarysearch(wert, mitte + 1, rechts);

			} else if (a[mitte] > wert) {
				return binarysearch(wert, links, mitte - 1);

			} else {
				return mitte;
			}
		}
		return -1;
	}

}
