package Uebung1;
public class Aufgabe_3 {
	public static void main(String[] args) {
		int anzahl = 6;
		int x = 0;
		for (int a = 1; a <= anzahl; a++) {

			for (int b = 1; b <= anzahl; b++) {
				if (b == a)
					;
				else {
					for (int c = 1; c <= anzahl; c++) {
						if (c == b || b == a || a == c)
							;
						else {
							for (int d = 1; d <= anzahl; d++) {
								if (c == d || c == b || a == b || a == d || a == c || b == d)
									;
								else {
									if (anzahl == 5 || anzahl == 6) {
										for (int e = 1; e <= anzahl; e++) {
											if (c == d || c == b || a == b || a == d || a == c || b == d || e == a || e == b || e == c || e == d)
												;
											else {
												if (anzahl == 6) {
													for (int f = 1; f <= anzahl; f++) {
														if (c == d || c == b || a == b || a == d || a == c || b == d || e == a || e == b || e == c || e == d || f == a || f == b || f == c || f == d
																|| f == e)
															;
														else {
															x++;
															System.out.println(x + ": " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);
														}
													}
												} else {
													x++;

													System.out.println(x + ": " + a + ", " + b + ", " + c + ", " + d + ", " + e);
												}
											}
										}
									} else {
										x++;
										if (x < 10) {
											System.out.println("0" + x + ": " + a + ", " + b + ", " + c + ", " + d);
										} else {
											System.out.println(x + ": " + a + ", " + b + ", " + c + ", " + d);
										}
									}
								}
							}
						}
					}
				}
			}

		}
	}
}
