package p2;

import utilidades.Teclado;

public class SumaTérminos {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el primer término de la serie aritmética.");
		int a1=Teclado.readInt();
		System.out.println("Introduzca el valor de la diferencia.");
		int d=Teclado.readInt();
		System.out.println("¿Cuántos términos quieres calcular? Introduzca un número entero");
		int n=Teclado.readInt();
		int an=(a1+(n-1)*d);
		int S=(n*(a1+an));
		System.out.println("La suma de los "+n+" términos es "+S+".");
		
	}
}
