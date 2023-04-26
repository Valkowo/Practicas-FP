package p2;

import utilidades.Teclado;

public class cilindro {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el radio de la base.");
		double r=Teclado.readDouble();
		System.out.println("Introduzca la altura del cilindro.");
		double h=Teclado.readDouble();
		double A=((2*(Math.PI)*r*h)+2*(Math.PI)*r*r);
		System.out.println("El área del cilindro seleccionado es de "+A+" unidades cuadradas.");
	}
}
