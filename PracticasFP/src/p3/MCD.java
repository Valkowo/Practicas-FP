package p3;

import utilidades.Teclado;

public class MCD {
	
	public static void main(String[] args) {
		
		System.out.println("Introduzca dos números enteros.");
		int a=Teclado.readInt();
		int b=Teclado.readInt();
		
		while (a!=b)
			if (a>b) {
				a=a-b;
			} else {
				b=b-a;
			}
		
		System.out.println(a);
	}
}