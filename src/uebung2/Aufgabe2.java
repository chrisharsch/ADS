package uebung2;

import java.util.Stack;


public class Aufgabe2 {

	public static void main(String[] args) {
	
		System.out.println(rek(10000));
	}
	
	public static long rek(long n) {
		if (n > 0) {
			System.out.println(n);
			return n + rek(n - 1);
			
		} else if (n < 0) {
			System.out.println(n);
			return n + rek(n + 1);
		}else{
			System.out.println(n);
			return n;
		}
	}

}
