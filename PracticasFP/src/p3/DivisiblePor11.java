package p3;

import utilidades.Teclado;

public class DivisiblePor11 {
	
	public static void main(String[] args) {
		System.out.println("Introduzca un número entero");
		//BUCLE DO/WHILE
		
		int i=Teclado.readInt();
		int a=1;
		do {
			if (((a%11)==0)&a%2==0) {
				System.out.println(a);
			}
			a++;
		}
		while (a<=i);
		
		/*
		//BUCLE FOR
		int max=Teclado.readInt();
		for (int x=0; x<=max;x++) {
			if ((x%11)==0)
			System.out.println(x);
		}
		*/		
	
	//SOLO PARES
	/*
		int max=Teclado.readInt();
		for (int x=0; x<=max;x++) {
			if ((x%11)==0) {
				if((x%2)==0) {
					System.out.println(x);
				}
			}	
		}
	 */
	//BUCLE WHILE
	/*
		int a=Teclado.readInt();
		int b=0;
		
		while ((b)<=a) {
			if ((b%11)==0) {
				System.out.println(b);
				}
			b++;
		}
	 */
		
	}
}
