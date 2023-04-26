package p3;

import utilidades.Teclado;

public class Calculadora {

	public static void main(String [] args) {
		
		System.out.println("Introduzca dos números enteros.");
		int a = Teclado.readInt();
		int b = Teclado.readInt();
		System.out.println("Seleccione una operación a realizar con estos números: \n1: Suma \n2: Resta \n3: Producto \n4: Cociente \n5: Residuo");
		int op = Teclado.readInt();
		switch (op) {
		case 1:
			int suma=a+b;
			System.out.println("La suma de "+a+" y "+b+" es "+suma+". ");
			break;
		case 2:
			int resta=a-b;
			System.out.println("La resta de "+a+" y "+b+" es "+resta+".");
			break;
		case 3:
			int producto=a*b;
			System.out.println("El producto de "+a +" y "+b +" es "+producto+".");
			break;
		case 4:
			if (b == 0) {
				System.out.println("No se puede dividir entre 0.");
			} else {
				int cociente=a/b;
				System.out.println("El cociente de "+a+" y "+b+" es "+cociente+".");
				
			}
			break;
		case 5:
			if (b == 0) {
				System.out.println("No se puede dividir entre 0.");
			} else {
				int resto=a%b;
				System.out.println("El resto del cociente entre "+a+" y "+b+" es "+resto+".");
				break;
			}
	}
}
}
