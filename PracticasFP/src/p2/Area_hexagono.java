package p2;

import utilidades.Teclado;

public class Area_hexagono {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el lado de la base del prisma hexagonal.");
		double lado=Teclado.readDouble();
		System.out.println("Introduzca la altura el prisma hexagonal");
		double altura=Teclado.readDouble();
		double perimetro=lado*6;
		double apotema=(lado/2)*Math.sqrt(3);
		double areaBase=perimetro*apotema;
		double areaPrisma=2*areaBase+lado*altura;
		System.out.println("El área del prisma es "+areaPrisma+".");
	
	}
}
