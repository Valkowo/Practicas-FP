package p2;

import utilidades.Teclado;

public class SumaGeométrica {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el primer término de la serie");
		int a1=Teclado.readInt();
		System.out.println("Introduzca el valor de la razón");
		int r=Teclado.readInt();
		System.out.println("Introduzca el número de términos que quieres sumar");
		int n=Teclado.readInt();
		int an=a1*((r)^(n-1));
		int S=((an*r-a1)/(r-1));
		System.out.println("La suma de los "+n+" términos de la progresión geométrica es "+S+".");
	}
}
