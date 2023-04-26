package p3;

import utilidades.Teclado;

public class Ecuacion2 {
	
    public static void main(String [] args) {
        System.out.println("Introduzca 3 n�meros enteros para la ecuaci�n:");
        int a = Teclado.readInt();
        int b = Teclado.readInt();
        int c = Teclado.readInt();
        double sqrt = (Math.sqrt(b*b-4*a*c));
        double y = ((-b)+sqrt)/(2*a);
        double z = ((-b)-sqrt)/(2*a);
        double check = (y+z);
        System.out.println("La ecuacion es y="+a+"x^2 + "+b+"x + "+c);
        
        System.out.println("Los resultados reales de la ecuaci�n son: "+ y +" y "+ z);
        if (Double.isNaN(check)) {
        	System.out.println("La ecuaci�n tiene soluciones complejas.");
        } else {
        	System.out.println("Ambas soluciones de la ecuaci�n son reales.");
        }
    }
}
