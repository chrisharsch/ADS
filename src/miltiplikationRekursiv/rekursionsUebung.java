package miltiplikationRekursiv;

public class rekursionsUebung {

	public static void main(String[] args) {
		System.out.println(multi(2,3));
		System.out.println(multi(23,4));
		System.out.println(multi(2, -5));
	}
	
	public static int multi(int a,int b){
		if(b==0){
			return 0;
		}else{
			if(b>0){
				return multi(a, b-1)+a;
			}else{
				return multi(a,b+1)-a;
			}
			
		}
	}
}