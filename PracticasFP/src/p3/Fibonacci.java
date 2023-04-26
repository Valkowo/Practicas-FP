package p3;

import utilidades.Teclado;

public class Fibonacci {

	public static void main(String[] args) {
		
		int max=Teclado.readInt(); 
		int a=0; 
		int b=1;
		
		for (int i=0; i<=max; i++) {
			int sum=(a+b);
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}			
	}
}
