package Examen;

public class Array implements IElementos {
	//variables de instancia
	private int [][] a;
	//constructores
	public Array() {
		a=null;
	}
	public Array(int [][]a) {
		this.a=ordenarElementos(a);
	}
	public int [][] getArray() {
		return a;
	}
	public int[][]ordenarElementos(int [][]a){
		int par=0;
		int impar=0;
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if (a[i][j]%2==0) {
					par++;
				} else {
					impar++;
				}
			}
		}
		int [][]b=new int[2][];
		b[0]=new int[par];
		b[1]=new int[impar];
		int q=0; int k=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if (a[i][j]%2==0) {
					b[0][q]=a[i][j];
					q++;
				} else {
					b[1][k]=a[i][j];
					k++;
				}
			}
		}
		return b;
	}
	public void ImprimirArray() {
		System.out.println("[");
		for (int i=0;i<a.length;i++) {
			for (int j=0;i<a[i].length;j++) {
				System.out.print(a[i][j]+",");
			}
			System.out.println(", ");
		}
		System.out.println("]");
	}
}
