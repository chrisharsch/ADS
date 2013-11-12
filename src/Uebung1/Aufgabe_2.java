package Uebung1;
public class Aufgabe_2 {
	
	public static void main(String[] args) {
		System.out.println(kgv(0, 1));

	}

	static int ggt(int m, int n) {
		if (n == 0)
			return m;
		else
			return ggt(n, m % n);
	}

	static int kgv(int m, int n) {
		int o = ggt(m, n);
		int p = (m * n) / o;
		return p;
	}
}
