package p51;

public class TestP51 {
	public static void main(String[]args) {
		
		Vector [] arrayVectores1=new Vector [8];
		Vector v1=new Vector(new Punto(100,0), new Punto(110,0));
		arrayVectores1[0]=v1;
		for (int i=1;i<8;i++) {
			arrayVectores1[i]=arrayVectores1[i-1].girar(45,0,0);
			System.out.println("Vector1("+i+")= "+arrayVectores1[i].toString());

		}	
		Vector [] arrayVectores2=new Vector[8];
		for (int i=0;i<8;i++) {
			arrayVectores2[i]=arrayVectores1[i].traslacion(25,100);
			System.out.println("Vector2("+i+")= "+arrayVectores2[i].toString());
		}
		for (int i=0;i<8;i++) {
			System.out.println("Distancia entre v1(3) y v2("+i+")="+arrayVectores1[2].getOrigen().distancia(arrayVectores2[i].getOrigen()));
		}
	}
}


