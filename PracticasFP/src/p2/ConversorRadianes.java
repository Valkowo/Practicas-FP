package p2;

import utilidades.Teclado;

public class ConversorRadianes {

	public static void main(String[] args) {
	
		System.out.println("Introduzca el valor de un ángulo en sexagesimal.");
		
		//double pi=3.1415926535;
		double a=Teclado.readDouble();
		double rads=((a*Math.PI)/180);
		double sen=Math.sin(rads);
		double cos=Math.cos(rads);
		double tan=Math.tan(rads);
		
		System.out.println("Para pasar este valor a radianes se usa la fórmula pi/180. Usándola obtenemos un valor de: "+rads+" radianes");
		System.out.println("El seno de este ángulo es: "+sen);
		System.out.println("El coseno de este ángulo es: "+cos);
		System.out.println("La tangente de este ángulo es: "+tan);
		
		
	}

}
