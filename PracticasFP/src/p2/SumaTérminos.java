package p2;

import utilidades.Teclado;

public class SumaT�rminos {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el primer t�rmino de la serie aritm�tica.");
		int a1=Teclado.readInt();
		System.out.println("Introduzca el valor de la diferencia.");
		int d=Teclado.readInt();
		System.out.println("�Cu�ntos t�rminos quieres calcular? Introduzca un n�mero entero");
		int n=Teclado.readInt();
		int an=(a1+(n-1)*d);
		int S=(n*(a1+an));
		System.out.println("La suma de los "+n+" t�rminos es "+S+".");
		
	}
}
