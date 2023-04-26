package p3;

import utilidades.Teclado;

public class Calculos {	
	
	public static double piLeibniz(long iters) {
		double pi=0;
		double calc=0;
		double res=0;
		if (iters<0) {		
			res=-1;		
		} else {		
			for (int i=0;i<=iters;i++) {		
			calc=(Math.pow(-1,i))/((2*i)+1);
			pi+=calc;	
		}	
		res=pi*4;	
		}
		return res;
	}
	public static double factorial(long n) {
		double res=1;
		double calc=1;
		double num1=1;
		if (n<=0) {
			if (n==0) {
				res=1;
			} 
			else {
				res=-1;
			}
		} 
		else {
			for (double i=1;i<=n;i++) {
				calc=i*num1;
				num1=calc;
			}
			res=calc;
		}		
		return res;
	}
	public static double potenciaEntera(double base, int exp) {
		double res=0;
		double calc=0;
		double num=1;
		if (exp<=0) {
			if (exp==0){
				res=1;
			} else {
				res=-1;
		}
		} else {
			for (long i=1;i<=exp;i++) {
				calc=base*num;
				num=calc;
			}
			res=calc;
		}
		return res;
	}
	public static double piEuler(long iters) {
		double res=0;
		double pi2=0;
		double numerador=0;
		double denominador=0;
		double calc=0;
		if (iters<0) {
			res=-1;
		}
		else {
			for (int i=0;i<=iters;i++) {
				 numerador=(potenciaEntera(2,i))*(potenciaEntera((factorial(i)),2));
				 denominador=factorial(2*i+1);
				 calc=numerador/denominador;
				pi2+=calc;			
			}
			res=pi2*2;
		}		
		return res;
	}
	public static double[] ecuacionCuadratica(long a,long b, long c) {
	        double discrimimante = (Math.sqrt(b*b-4*a*c));
	        double res1 = ((-b)+discrimimante)/(2*a);
	        double res2 = ((-b)-discrimimante)/(2*a);
	        double [] resultados = {res1,res2};
	        return resultados;	
	}
	public static long maximoComunDivisor(long mcd1, long mcd2) {
		while (mcd1!=mcd2)
			if (mcd1>mcd2) {
				mcd1-=mcd2;
			} else {
				mcd2-=mcd1;
			}
		return mcd1;
	}
	public static int[] fibonacci(int max) {
		int [] serieFibonacci=new int[max];
		serieFibonacci[0]=1;
		serieFibonacci[1]=1;
		for(int i=2; i<max;i++) {
			serieFibonacci[i]=serieFibonacci[i-1]+serieFibonacci[i-2];
			//System.out.println(serieFibonacci[i]);
		}
		return serieFibonacci;
	}
	public static double eEuler(long iters) {
		double e=0;
		for (int i=0;i<=iters;i++) {
			e+=(1/factorial(i));
		}
		return e;
	}
	
public static void main(String [] args) {
		
		System.out.println("Elige una operación. \n1: Pi por Liebniz.\n2: Pi por Euler.\n3: Potencia entera.\n4: Factoriales.\n5: Ecuación cuadrática.\n6: Máximo Común Divisor\n7: Fibonacci.\n8: e por Euler.");
		int operación=Teclado.readInt();
		switch (operación) {
		case 1:
			System.out.println("Has elegido: Pi por Leibniz.\nInserte el número de veces que quiere que se itere la función.");
			long itersLeibniz=Teclado.readLong();
			double piLeibniz=piLeibniz(itersLeibniz);
			System.out.println("Iterando la función "+itersLeibniz+" veces se obtiene que Pi="+piLeibniz+".");
			break;
		case 2:
			System.out.println("Has elegido: Pi por Euler.\nInserte el número de veces que quiere que se itere la función.");
			long itersEuler=Teclado.readLong();
			double pi=piEuler(itersEuler);
			System.out.println("Tras iterar la función de Euler "+itersEuler+" veces, se obtiene que Pi= "+pi+".");
			break;
		case 3:
			System.out.println("Has elegido: Potencias enteras.\nIntroduzca el número que quiere elevar.");
			long base=Teclado.readLong();
			System.out.println("Introduzca el exponente.");
			int exp=Teclado.readInt();
			double potencia=potenciaEntera(base,exp);
			System.out.println(base+" elevado a "+exp+" es "+potencia);
			break;
		case 4:
			System.out.println("Has elegido: Factorial.\nDa un número entero para calcular su factorial");
			long f=Teclado.readLong();
			double fact=factorial(f);
			System.out.println("El valor de "+f+"! es: "+fact+".");
			break;
		case 5:
			System.out.println("Has elegido: Ecuación cuadrática.\nIntroduce 3 números para la ecuación cuadrática ax^2+bx+c");
			int a=Teclado.readInt();
			while (a==0) {
				System.out.println("El valor de 'a' no puede ser 0");
				a=Teclado.readInt();
			}
			System.out.println("a="+a);
			int b=Teclado.readInt();
			System.out.println("b="+b);
			int c=Teclado.readInt();
			System.out.println("c="+c);
			while ((potenciaEntera(b,2)*(-4)*a*c)<0) {
				System.out.println("La ecuación dará soluciones no reales. Introduce nuevos valores.");
				a=Teclado.readInt();
				System.out.println("a="+a);
				b=Teclado.readInt();
				System.out.println("b="+b);
				c=Teclado.readInt();
				System.out.println("c="+c);
			}
			double[]resultadosEcuacion=ecuacionCuadratica(a,b,c);
			System.out.println("Los resultados de la ecuación ("+a+")x^2+("+b+")x+("+c+") son "+resultadosEcuacion[0]+" y "+resultadosEcuacion[1]);
			break;
		case 6:
			System.out.println("Has elegido: Máximo común divisor.\nIntroduce un número natural");
			long maximoComunDivisor1=Teclado.readInt();
			System.out.println("Introduce otro número natural");
			long maximoComunDivisor2=Teclado.readInt();
			long maximoComunDivisor=maximoComunDivisor(maximoComunDivisor1,maximoComunDivisor2);
			System.out.println(maximoComunDivisor);
			break;
		case 7:
			System.out.println("Has escogido: Fibonacci.\nDi el número de elementos de la serie que quieres que se calculen.");
			int maxFibonacci=Teclado.readInt();
			int[]serieFibonacci=fibonacci(maxFibonacci);
			System.out.print("Los "+maxFibonacci+" primeros números de la serie de fibonacci son"+" ");
			for (int i=0;i<maxFibonacci;i++) {
				System.out.print(serieFibonacci[i]+", ");
			}
			System.out.print(".");
			break;
		case 8:
			System.out.println("Has escogido: e por Euler.\nIntroduce el número de veces que quieres iterar la funcion");
			int iteracionesE=Teclado.readInt();
			double e=eEuler(iteracionesE);
			System.out.println("e="+e);
			break;
		default:
			System.out.println("Número no válido.\nEscoge un número del 1 al 7.");
		}		
	}
}
