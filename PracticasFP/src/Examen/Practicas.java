package Examen;

public class Practicas {
	public static double media (double [] a) {
		double  res=0;
		for (int i=0;i<a.length;i++) {
			res+=a[i];
			//System.out.println(res);
		}
		return res/(a.length);
	}
	public static double errorMedia (double m, double [] a) {
		double num=0;
		for (int i=0;i<a.length;i++) {
			num+=Math.pow((a[i]-m),2);
		}
		return Math.sqrt(num/((a.length)*(a.length-1)));
	}
	public static double mediosCuadradosM (double [] i, double [] v) {
		double aux1=0; double aux2=0;	double aux3=0;	double aux4=0;
		for (int k=0;k<i.length;k++) {
			aux1+=(i[k]*v[k])/10000;
		}
		for (int k=0;k<i.length;k++) {
			aux2+=i[k]/100;
		}
		for (int k=0;k<i.length;k++) {
			aux3+=v[k]/100;
		}
		for (int k=0;k<i.length;k++) {
			aux4+=Math.pow(i[k],2)/10000;
		}
		return (10*aux1-(aux2*aux3))/(10*aux4-(Math.pow(aux2,2)));
	}
	public static double mediosCuadradosN (double [] i, double [] v) {
		double aux1=0; double aux2=0;	double aux3=0;	double aux4=0;	double aux5=0;
		for (int k=0;k<10;k++) {
			aux1+=v[k];
		}
		for (int k=0;k<10;k++) {
			aux2+=Math.pow(i[k],2);
		}
		for (int k=0;k<10;k++) {
			aux3+=i[k];
		}
		for (int k=0;k<10;k++) {
			aux4+=i[k]*v[k];
		}
		for (int k=0;k<10;k++) {
			aux5+=Math.pow(i[k],2);
		}
		return (((aux1*aux2)-(aux3*aux4))/(10*aux5-Math.pow(aux3,2)));
	}
	public static double desviacionM (double [] i) {
		double aux1=0; double aux2=0;
		for (int k=0; k<10; k++) {
			aux1+=Math.pow(i[k],2);
		}
		for (int k=0;k<10;k++) {
			aux2+=i[k];
		}
		return Math.sqrt((aux1)/((10*aux1)-Math.pow(aux2,2)));
	}
	public static double desviacionN (double [] a) {
		double aux1=0; double aux2=0;
		for (int i=0; i<10; i++) {
			aux1+=Math.pow(a[i],2);
		}
		for (int i=0;i<10;i++) {
			aux2+=a[i];
		}
		return Math.sqrt((aux1)/((10*aux1)-Math.pow(aux2,2)));
	}
	public static double calcularR (double mi, double mv, double [] i, double [] v) {
		double aux1=0; double aux2=0; double aux3=0; double aux4=0;
		for (int q=0;q<10;q++) {
			aux1+=(i[q]-mi);
			//System.out.println("dif I("+q+")= "+aux1+ "    I= "+i[q]+"    media I="+mi);
		}
		for (int q=0;q<10;q++) {
			aux2+=(v[q]-mv);
		}
		for (int q=0;q<10;q++) {
			aux3+=Math.pow((i[q]-mi),2);
		}
		for (int q=0;q<10;q++) {
			aux4+=Math.pow((v[q]-mv),2);
		}
		//System.out.println("aux1= "+aux1+"   aux 2= "+aux2);
		return Math.sqrt(((aux1*aux2)/(Math.sqrt(aux3*aux4))));
	}
	
	
	public static void main(String[] args) {
		
		//datos
		double [] L=new double [10];
			L[0]=3.070; L[1]=3.050; L[2]=3.100; L[3]=3.110; L[4]=3.090; L[5]=3.250; L[6]=2.995; L[7]=3.150; L[8]=3.100; L[9]=3.200;
		double [] a=new double [10];
			a[0]=1.260; a[1]=1.300; a[2]=1.330; a[3]=1.320; a[4]=1.395; a[5]=1.440; a[6]=1.445; a[7]=1.430; a[8]=1.480; a[9]=1.445;
		
		double [] V=new double [10];
			V[0]=0.355;	V[1]=0.849;	V[2]=1.100;	V[3]=2.000;	V[4]=2.760;	V[5]=3.700;	V[6]=4.750;	V[7]=5.520;	V[8]=6.270;	V[9]=7.580;
		double [] I=new double [10];
			I[0]=0.126;	I[1]=0.232;	I[2]=0.379;	I[3]=0.670;	I[4]=0.917;	I[5]=1.290;	I[6]=1.342;	I[7]=1.793;	I[8]=2.100; I[9]=2.540;
		double [] R=new double [10];
			R[0]=2.817; R[1]=3.659; R[2]=2.902; R[3]=2.985; R[4]=3.009; R[5]=2.868; R[6]=3.080; R[7]=3.079; R[8]=2.986; R[9]=2.984;
		double ro=6*Math.pow(10,-4);
		
		//operaciones
			double meda=media(a);
			System.out.println("media a= "+meda/100);
			double erra=errorMedia(meda,a);
			System.out.println("eror media a= "+erra/100);
			
			double medL=media(L);
			System.out.println("media L= "+medL/100);
			double errL=errorMedia(medL,L);
			System.out.println("error media L= "+errL/100);
			
			double e=(((6*(Math.pow(10,-4))*medL/100)/(media(R)*meda/100)));
			System.out.println("e= "+e);
			
			double m=mediosCuadradosM(I,V);
			System.out.println("m= "+m);
			
			double n=mediosCuadradosN(I,V);
			System.out.println("n= "+n);
			
			double r=calcularR(media(I),media(V),I,V);
			double primero=Math.abs((ro/(m*meda/100)))*errL/100;
			double segundo=Math.abs(-1/(Math.pow(m,2)))*((ro*medL/100)/meda/100)*desviacionM(I);
			double tercero=Math.abs(-1/Math.pow(meda/100,2))*((ro*medL/100)/m)*erra/100;
			double erre2=primero+segundo+tercero;
			//double erre=(Math.abs(ro/(m*meda))*errL+Math.abs((1/(m*m)))*((ro*medL)/meda)*desviacionM(I)+Math.abs((-1/Math.pow(meda,2)))*((ro*medL)/m)*erra);
			System.out.println("error e= "+erre2);
			System.out.println("R= "+r);
			System.out.println("resistencia= "+desviacionM(I));
	}
	
}
