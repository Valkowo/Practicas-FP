package p2;

import utilidades.Teclado;

public class calculadora {
	
	public static void main(String[] args) {
/*	
		//este es más eficiente para guardar espacios para variables
		System.out.println("Introduzca un número entero");
		int n1=Teclado.readInt();
		System.out.println("Ahora otro.");
		int n2=Teclado.readInt();
		System.out.println("Suma:"+ (n1+n2));
		System.out.println("Resta:"+ (n1-n2));
		System.out.println("Producto:"+ (n1*n2));
		System.out.println("Cociente:"+ (n1/n2));
		System.out.println("Valor absoluto del primer número: "+ Math.abs(n1));
		*/
		
		System.out.println("Introduzca un entero.");
		int n1=Teclado.readInt();
		
		System.out.println("Introduzca otro.");
		int n2=Teclado.readInt();
		
		int suma=n1+n2;
		int resta=n1-n2;
		int producto=n1*n2;
		int cociente=n1/n2;
		int resto=n1%n2;
		int absoluto=Math.abs(n1);
				
		System.out.println("La suma de "+n1 +" y "+n2 +" es " +suma);
		System.out.println("La resta de "+n1 +" y "+n2 +" es " +resta);
		System.out.println("El producto de "+n1 +" y "+n2 +" es " +producto);
		System.out.println("La división de "+n1 +" y "+n2 +" es " +cociente);
		System.out.println("El resto de la división entre "+n1 +" y "+n2 +" es " +resto);
		System.out.println("El valor absoluto de "+n1 +" es "+absoluto);
		
	}
}
