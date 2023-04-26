package p4;

import utilidades.Teclado;
import java.util.Arrays;

public class ProcesarArrays {
	
	public static int [] nuevoArray () {
		System.out.println("Introduce la longitud del array");
		int [] array=new int[Teclado.readInt()];
		System.out.println("La longitud del nuevo array será "+array.length+".\nIntroduce los "+array.length+" elementos del nuevo array.");
		for (int i=0; i<array.length;i++) {
			array[i]=Teclado.readInt();
		}
		return array;
	}
	public static int [][] nuevoArrayBi () {
		System.out.println("Introduce el número de filas");
		int filas=Teclado.readInt();
		System.out.println("Introduce el número de columnas");
		int colum=Teclado.readInt();
		int [][] a=new int [filas][colum];
		System.out.println("Introduce los valores del array");
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				a[i][j]=Teclado.readInt();
			}
		}
		return a;
	}
	public static int sumaElementos (int [] a) {
		int suma=0;
		if (a==null || a.length==0) {
			suma=-1;
		}
		else {
			for(int i=0;i<a.length;i++){
			suma+=a[i];
			}
		}
		return suma;
	}
	public static int [] sumaArrays (int [] a, int [] b) {
		int [] sumaArrays = new int[a.length];
		if (a.length!=b.length || a.length==0 || b.length==0) {
			sumaArrays=null;
		}
		else {
			for(int i=0;i<a.length;i++) {
				sumaArrays[i]=a[i]+b[i];
			}
		}
		return sumaArrays;
	}
	public static int cuentaOcurrencias (int [] a, int k) {
		int ocurrencias=0;
		if (a==null || a.length==0) {
			ocurrencias=-1;
		} 
		else {
			for (int i=0;i<a.length;i++) {
				if (a[i]==k) {
					ocurrencias++;
				}
			}
		}
		return ocurrencias;
	}
	public static int busquedaLineal (int [] a,int clave) {
		int indiceClave=0;
		if (a==null || a.length==0) {
			indiceClave=-1;
		}
		else {
			for (int i=0;i<a.length;i++) {
				if (a[i]==clave) {
					indiceClave=i;
				}
			}
		}
		return indiceClave;
	}
	public static int [] alternarElementos (int [] a, int [] b) {
		int longitudArray=(a.length)+(b.length);
		int [] arrayAlternado=new int[longitudArray];
		if (a==null || b==null || a.length!=b.length) {
			arrayAlternado=null;
		}
		else {
			for (int i=0;i<(longitudArray/2);i++) {
				arrayAlternado[2*i]=a[i];
				arrayAlternado[2*i+1]=b[i];
			}
		}
		return arrayAlternado;
	}
	public static int [] invertirArrays (int [] a) {
		int [] arrInv=new int [a.length];
		if (a==null || a.length==0) {
			a=null;
		}
		else {
			for (int i=0;i<a.length;i++) {
				arrInv[i]=a[(a.length-1-i)];
			}
		}
		return arrInv;
	}
	public static int [] eliminarK(int [] a, int k) {
        int ocurrenciasK=0;
        int back=0;
        if (a.length==0 || a==null) {
            return null;
        } 
        else {
            for (int i=0;i<a.length;i++) {
                if (a[i]==k) {
                    ocurrenciasK++;
                }
            }
            int lengthElim=(a.length-ocurrenciasK);
            int [] elim = new int [lengthElim];
            for (int i=0;i<elim.length;i++) {
                if (a[i+back]==k) {
                    back++;
                }
                    elim[i]=a[i+back];
                    
            }
            if (ocurrenciasK==a.length) {
                int [] excep=new int [0];
                return excep;
            } else {
                return elim;
            }    
        }        
    }
	public static boolean elementosRepetidos(int [] a) {
		boolean repetidos=false;
		if (a==null || a.length==0 || a.length ==1) {
			repetidos=false;
		} 
		else {
			for (int i=0;i<a.length;i++) {
				for (int j=0;i<a.length;i++) {
					if (a[i]==a[j] && i!=j) {
						repetidos=true;
					}
				}
			}
		}
		
		return repetidos;
	}
	public static int [] indices(int [] a, int n) {
		int ocurrencias=cuentaOcurrencias(a,n);
		int [] indices=new int [ocurrencias];
		int j=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]==n) {
				indices[j]=i;
				j++;
			}
		}
		return indices;
	}
	public static boolean enOrden (int [] a, boolean ascendente) {
		boolean ordenado=false;
		if (a==null || a.length==0) {
			ordenado=false;
		}
		else {
			if (ascendente==true) {
				for (int i=0;i<a.length-1;i++) {
					if (a[i]<=a[i+1]) {
						ordenado=true;
					}				
					else {
						ordenado=false;
					}
				}
				
			}
			else {
				for (int i=0;i<a.length-1;i++) {
					if (a[i]>=a[i+1]) {
						ordenado=true;
					}				
					else {
						ordenado=false;
					}
				}
			}
		}
		return ordenado;
	}
	public static int [] ordenar (int [] a, boolean ascendente) {
		if (a.length==0 || a==null) {
			return null;
		}
		int [] b=new int [a.length];
		int intercambio=0;
		for (int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for (int p=0;p<b.length-1;p++) {
			for (int i=0;i<b.length-1-p;i++) {
				if(b[i]>b[i+1]) {
					intercambio=b[i];
					b[i]=b[i+1];
					b[i+1]=intercambio;
				}
			}
		}
		return b;
	}
	public static boolean esMatriz (int [][] a) {
		if (a==null || a.length==0 ) {
			return false;
		}
		for (int i=0;i<a.length;i++) {
			if (a[0].length!=a[i].length) {
				return false;
			}
		}
		return true;
	}
	public static boolean esCuadrada (int [][] a) {
		if (a.length==0 || a==null || esMatriz(a)==false) { return false;}
		if (a.length!=a[0].length) {return false;}
		return true;
	}
	public static int [][] quitarFila(int [][] a, int n){
		if (a==null || a.length==0 || esMatriz(a)==false || n>=a.length) {
			return null;
		}
		int [][]b=new int [a.length-1][a[0].length];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				if (i<n) {
					b[i][j]=a[i][j];
				}
				else {
					b[i-1][j]=a[i][j];
				}
			}
		}
		return b;
	}
	public static int [][] quitarCol (int [][] a, int n){
		if (a==null || a.length==0 || esMatriz(a)==false) {
			return null;
		}
		int[][]b=new int [a.length][a[0].length-1];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				if (j<n) {
					b[i][j]=a[i][j];
				}
				else {
					b[i][j-1]=a[i][j];
				}
			}
		}
		return b;
		
	}
	public static int [][] menorComplementario (int [][]m, int i, int j){
		if (m==null || m.length==0 || esMatriz(m)==false) { return null; }
		int [][]sinColumna=quitarCol(m,j);
		int [][]sinFila=quitarFila(sinColumna, i);
		return sinFila;
		
	}
	public static int [] diagonal (int [][] a) {
		if (a==null || a.length==0 || esCuadrada(a)==false) {return null;}
		int [] b=new int [a.length];
		int count=0;
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				if (i==j) {
					b[count]=a[i][j];
					count++;
				}
			}
		}
		return b;
	}
	public static int [] diagonalSecundaria (int [][]a) {
		if (a==null || a.length==0 || esCuadrada(a)==false) {return null;}
		int [] b=new int [a.length];
		int count=0;
		for (int i=0;i<a.length;i++) {
			for (int j=a[0].length-1;j>=0;j--) {
				if (i+j==a.length-1 ) {
				b[count]=a[i][j];
				count++;
				}
			}
		}
		return b;
	}
	public static double calcularMedia (int [][] a) {
		if (a==null || a.length==0 || esMatriz(a)==false) {return -1;}
		double suma=0;
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				suma+=a[i][j];
			}
		}
		double media=suma/(a.length*a[0].length);
		return media;
	}
	public static double media (double [] a) {
		int res=0;
		for (int i=0;i<a.length;i++) {
			res+=a[i];
		}
		return res/(a.length);
	}
	
	public static void main(String[] args) {
		
		//
		System.out.println("Qué tipo de arrays quieres manejar");
		System.out.println("1: Arrays unidimensionales.\n2: Arrays bidimensionales");
		int dimension=Teclado.readInt();
		switch (dimension) {
		case 1:
			System.out.println("Escoje el programa que quieres utilizar");
			System.out.println("1: Sumar los elementos de un array.\n2: Sumar dos arrays.\n3: Contar ocurrencias de k.\n4: Búsqueda lineal de k.\n5: Alternar arrays.\n6: Invertir arrays\n7: Eliminar de un array.\n8: Elementos repetidos\n9: Indices.\n10: Comprobar orden.\n11: Ordenar un array.");
			int opcion=Teclado.readInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce la longitud del nuevo array");
				int [] arrayEnteros=nuevoArray();
				int sumaEnteros=sumaElementos(arrayEnteros);
				System.out.println("La suma de los elementos del array es "+sumaEnteros);
				break;
			case 2:
				System.out.println("Introduce la longitud del primer array");
				int [] array1=nuevoArray();
				System.out.println("Introduce la longitud del segundo array");
				int [] array2=nuevoArray();
				int [] sumaArrays=sumaArrays(array1,array2);
				if (sumaArrays==null) {
					System.out.println("null");
				}
				else {
					System.out.println("La suma de los arrays es "+Arrays.toString(sumaArrays));
				}
				break;
			case 3:
				System.out.println("Introduce el rango del array");
				int [] a=nuevoArray();
				System.out.println("Introduce el número del que quieres saber las ocurrencias");
				int k=Teclado.readInt();
				int ocurrencias=cuentaOcurrencias(a,k);
				System.out.println("Las veces que el número "+k+" ha aparecido en el array son "+ocurrencias+".");
				break;
			case 4:
				System.out.println("Introduce la longitud del array");
				int [] arrayBusquedaLineal=nuevoArray();
				System.out.println("Introduce qué número quieres buscar");
				int clave=Teclado.readInt();
				int celdaClave=busquedaLineal(arrayBusquedaLineal,clave);
				System.out.println("El índice donde se encuentra el número "+clave+" es el número "+celdaClave+".");
				break;
			case 5:
				System.out.println("Introduce la longitud del primer array");
				int [] arrayAlternado1=nuevoArray();
				System.out.println("Introduce la longitud del segundo array");
				int [] arrayAlternado2=nuevoArray();
				int [] arrayAlternado=alternarElementos(arrayAlternado1,arrayAlternado2);
				System.out.println(Arrays.toString(arrayAlternado));
				break;
			case 6:
				System.out.println("Has escogido: Invertir arrays");
				System.out.println("Introduce la longitud del array.");
				int [] arrayToInv=nuevoArray();
				int [] arrInv=invertirArrays(arrayToInv);
				System.out.println("a = "+Arrays.toString(arrayToInv)+" -> invertir (a), b = "+Arrays.toString(arrInv));
				break;
			case 7:
				System.out.println("Has escogido: Eliminar de un array.");
				int [] arrayToElim=nuevoArray();
				System.out.println("Introduce el elemento que quieres eliminar");
				int elimArray=Teclado.readInt();
				int [] arrayElim=eliminarK(arrayToElim,elimArray);
				System.out.println("El array "+Arrays.toString(arrayToElim)+" queda, tras eliminar el número "+elimArray+" como "+Arrays.toString(arrayElim));
				break;
			case 8:
				int [] arrayRep=nuevoArray();
				boolean repetidos=elementosRepetidos(arrayRep);
				System.out.println(repetidos);
				break;
			case 9:
				int [] arrayOcurrencias=nuevoArray();
				System.out.println("Introduce el número que quieres buscar");
				int kContar=Teclado.readInt();
				int [] indices=indices(arrayOcurrencias,kContar);
				System.out.println("El número "+kContar+" está en el array "+Arrays.toString(arrayOcurrencias)+" en las celdas: \n"+Arrays.toString(indices));
				break;
			case 10:
				int [] ordenado=nuevoArray();
				boolean orden=false;
				System.out.println("Cómo se hará la comprobación?\n1: Ascendentemente\n2: Descendentemente");
				int orientación=Teclado.readInt();
				switch (orientación) {
				case 1:
					orden=true;
					break;
				case 2:
					orden=false;
					break;
				default:
					System.out.println("Número no válido.");	
				}
				boolean ordenado2=enOrden(ordenado,orden);
				if (ordenado2==false) {
					System.out.println("El array no está ordenado");
				}
				else {
					if (ordenado2==true) {
						if(ordenado2==true) {
							System.out.println("El array está ordenado ascendentemente.");
						} else {
							System.out.println("El array está ordenado descendentemente.");
						}
					}
				}
				break;
			case 11:
				System.out.println("Cómo se ordenará el array?\n1: Ascendentemente\n2: Descendentemente");
				boolean ordenamiento=false;
				switch (Teclado.readInt()) {
				case 1:
					ordenamiento=true;
					break;
				case 2:
					ordenamiento=false;
					break;
				default:
					System.out.println("Número no válido.");	
				}
				int [] arrayAOrdenar=nuevoArray();
				int [] arrayOrdenado=ordenar(arrayAOrdenar,ordenamiento);
				System.out.println(Arrays.toString(arrayAOrdenar)+" pasa a ser "+Arrays.toString(arrayOrdenado));
				break;
			}
			break;
		case 2:
			System.out.println("Escoje el programa que quieres utilizar:");
			System.out.println("1: Comprobar si es matriz.\n2: Eliminar una fila.\n3: Eliminar una columna.");
			System.out.println("4: Calcular un menor complementario.\n5: Diagonal principal. \n6: Diagonal secundaria.\n7: Calcular media.");
			int opcion2=Teclado.readInt();
			switch (opcion2) {
			case 1:
				int [][] esMatriz=nuevoArrayBi();
				boolean matriz=esMatriz(esMatriz);
				System.out.println(Arrays.deepToString(esMatriz));
				if (matriz==true) {
					System.out.println("El array es una matriz");
				} else {
					System.out.println("El array no es una matriz");
				}
				break;
			case 2:
				int [][]arrayAEliminar=nuevoArrayBi();
				System.out.println("Introduce el número de la fila que quieres eliminar");
				int filaEliminar=Teclado.readInt();
				int [][]arrayEliminado=quitarFila(arrayAEliminar,filaEliminar);
				System.out.println(Arrays.deepToString(arrayEliminado));
				break;
			case 3:
				int [][]eliminarColm=nuevoArrayBi();
				System.out.println("Introduce el elemento de la columna que quieres eliminar");
				int columnaEliminar=Teclado.readInt();
				int [][]columnaEliminada=quitarCol(eliminarColm,columnaEliminar);
				System.out.println(Arrays.deepToString(columnaEliminada));
				break;
			case 4:
				int[][]calcularMenor=nuevoArrayBi();
				System.out.println("Qué fila quieres eliminar");
				int filaMenorEliminar=Teclado.readInt();
				System.out.println("Qué columna quieres eliminar");
				int columnaMenorEliminar=Teclado.readInt();
				int[][]calculadoMenor=menorComplementario(calcularMenor,filaMenorEliminar,columnaMenorEliminar);
				System.out.println(Arrays.deepToString(calculadoMenor));
				break;
			case 5:
				int [][]arrayDiagonal=nuevoArrayBi();
				System.out.println(Arrays.deepToString(arrayDiagonal));
				int [] diagonalArray=diagonal(arrayDiagonal);
				System.out.println(Arrays.toString(diagonalArray));
				break;
			case 6:
				int [][]arrayDiagonalSecundaria=nuevoArrayBi();
				int []diagonalSecundariaArray=diagonalSecundaria(arrayDiagonalSecundaria);
				System.out.println(Arrays.toString(diagonalSecundariaArray));
				break;
			case 7:
				int [][]arrayMedia=nuevoArrayBi();
				double mediaArray=calcularMedia(arrayMedia);
				System.out.println(mediaArray);
				break;
			default:
				System.out.println("Número no válido");
			}
		}
	}
}

