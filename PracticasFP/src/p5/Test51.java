package p51;

public class Test51 {
	public static void main(String[] args) {
		Punto [] arrayPuntos1=new Punto[8];
		Punto p1=new Punto (100,0);
		arrayPuntos1[0]=p1;
		for (int i=1;i<8;i++) {
			arrayPuntos1[i]=arrayPuntos1[i-1].girar(45,0,0);
		}
		for (int i=0;i<8;i++) {
			System.out.println("Punto "+(i+1)+"= "+arrayPuntos1[i].toString());
		}
		Punto [] arrayPuntos2=new Punto[8];
		for (int i=0;i<8;i++) {
			arrayPuntos2[i]=arrayPuntos1[i].traslacion(25,100);
			System.out.println("Punto "+i+" trasladado= "+arrayPuntos2[i].toString());
		}
		for (int i=0;i<8;i++) {
			System.out.println("Distanancia entre el tercer punto y el punto "+i+": \n"+arrayPuntos1[3].distancia(arrayPuntos2[i]));
		}
	}
}
