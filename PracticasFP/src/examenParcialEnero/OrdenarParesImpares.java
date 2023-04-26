package examenParcialEnero;
import utilidades.Teclado;

public class ordenarParesImpares implements IElementos {
		private int [][] a;
		
		public int [][] getArray(){
			return a;
		}
		public int [][] ordenarElementos (int [][]a){
			int par=0;
			int impar=0;
			for (int i=0;i<a.length;i++) {
				for (int j=0;j<a[i].length;j++) {
					if (a[i][j]%2==0) {
						par+=1;
					}
					else {
						impar+=1;
					}
				}
			}
			int [][]b=new int [2][];
			b[0]=new int [par];
			b[1]=new int [impar];
			int k=0; int q=0;
			for (int i=0;i<a.length;i++) {
				for (int j=0;j<a[i].length;j++) {
					if (a[i][j]%2==0) {
						b[0][k]=a[i][j];
						k++;
					}
					else {
						b[1][q]=a[i][j];
						q++;
					}
				}
			}
			return b;
		}
		
		public ordenarParesImpares(int [][] b) {
			a=ordenarElementos(b);
		}
		
		public void mostrar () {
			for (int i=0;i<a.length;i++) {
				for (int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		public static int [] masPares (ordenarParesImpares a, ordenarParesImpares b) {
			if (a.getArray()[0].length>b.getArray()[0].length) {
				return a.getArray()[0];
			} else if (a.getArray()[0].length<b.getArray()[0].length) {
				return b.getArray()[0];
			} else {
				return null;
			}
		}
		public static void main (String []args) {
			int [][]a = {{1,5,3,2,6,7},{2,6,5,3,7,4}};
			ordenarParesImpares c=new ordenarParesImpares(a);
			int [][]b= {{1,5,4,7,5,4},{3,6,6,47,8,5,8}};
			ordenarParesImpares d=new ordenarParesImpares(b);	
			c.mostrar();
			masPares(c,d);
		}


}
