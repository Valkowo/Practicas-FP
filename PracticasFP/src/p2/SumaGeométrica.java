package p2;

import utilidades.Teclado;

public class SumaGeom�trica {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el primer t�rmino de la serie");
		int a1=Teclado.readInt();
		System.out.println("Introduzca el valor de la raz�n");
		int r=Teclado.readInt();
		System.out.println("Introduzca el n�mero de t�rminos que quieres sumar");
		int n=Teclado.readInt();
		int an=a1*((r)^(n-1));
		int S=((an*r-a1)/(r-1));
		System.out.println("La suma de los "+n+" t�rminos de la progresi�n geom�trica es "+S+".");
	}
}
