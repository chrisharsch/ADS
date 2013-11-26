package uebung3;

public class aufgabe3 {
	public static void main(String[] args) {
		int[] a = { 8, 2, 3, 4, 1, 4, 2, 3 };
		shakersort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	public static int[] shakersort(int[] a) {
		for (int j = 0; j < a.length; j++) {
			for (int i = 1; i < a.length; i++) {
				if (a[i-1] > a[i]) {
					swap(i-1, i, a);
				}

			}
			for (int i = a.length - 2; i <= 0; i--) {
				if (a[i] < a[i + 1]) {
					swap(i, i+1,a);
				}
			}
		}
		return a;

	}
	public static void swap(int i , int j, int[] a){
		int temp = a[i];
		a[i] = a[i + 1];
		a[i + 1] = temp;
	}
}
