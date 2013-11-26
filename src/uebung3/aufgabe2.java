package uebung3;

public class aufgabe2 {
	public static void main(String[] args) {
		System.out.println(f(-10, -1));

	}

	public static double funktion(double x) {
		//return Math.sin(x);
		return (x+1)*(x+1)-1;

	}

	/*
	 * public static int f(double x, double y) { if (x == y) { return -1; } else
	 * if (x < -2 && y > -2 && y < 0) { return -2; } else if (x > -2 && x < 0 &&
	 * y > 0) { return 0; } else { return -1; } }
	 */
	public static double f(double x1, double x2) {
		double mitte = x1 + ((x2 - x1) / 2);
		while ((int) (x1*100000) != (int) (x2* 100000)) {
			mitte = x1 + ((x2 - x1) / 2);
			if (funktion(mitte) < 0) {
				x2 = mitte;
			} else {
				x1 = mitte;
	
			}
		}
		System.out.println(mitte);
		mitte=  (int) (mitte*100000);
		mitte = mitte /100000;
		return mitte;

		/*
		 * if(x1 == x2){ return -1; }
		 * 
		 * double mitte = x1+((x2-x1)/2); mitte = Math.round(mitte * 10000) /
		 * 10000.0; /*mitte = r(mitte); if(mitte ){ return 3.14159; }else if(
		 * funktion(mitte)< 0){ return f(x1, mitte );
		 * 
		 * }else if( funktion(mitte)>0){ return f(mitte ,x2);
		 * 
		 * }else{ return mitte; }
		 */
	}

	static double r(double x) {
		x = x * 1000;
		x = Math.round(x);
		x = x / 1000;
		return x;
	}

}
