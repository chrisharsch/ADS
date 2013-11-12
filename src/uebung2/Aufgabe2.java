package uebung2;

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rek(-10));
	}

	public static int rek(int n) {
		if (n > 0) {
			return n + rek(n - 1);
		} else if (n < 0) {
			return n + rek(n + 1);
		}else{
			return n;
		}
	}

}
