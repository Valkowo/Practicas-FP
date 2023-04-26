package practicasObjetos;
import utilidades.Teclado;

public class Prueba {
	
	public static void main(String[] args) {
		System.out.println("Introduce la fecha en el siguiente formato dd/mm/yy");
		System.out.println("Día: ");
		int d=Teclado.readInt();
		System.out.println("Mes: ");
		int m=Teclado.readInt();
		System.out.println("Año: ");
		int y=Teclado.readInt();
		Date d1=new Date (d,m,y);
		while (d1.checkDate()==false) {
			System.out.println("Fecha no válida. Introduce los valores otra vez.");
			System.out.println("Día: ");
			d=Teclado.readInt();
			System.out.println("Mes: ");
			m=Teclado.readInt();
			System.out.println("Año: ");
			y=Teclado.readInt();
			d1.setDate(d,m,y);
		}
		System.out.println("La fecha es "+d1.toString()+".");

		
	}

}
