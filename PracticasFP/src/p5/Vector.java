package p51;
import java.text.DecimalFormat;
public class Vector implements IForma {
	
	//variables de instancia
	private Punto origen;
	private Punto extremo;
	
	//constructores
	public Vector() {
		origen=new Punto(0,0);
		extremo=new Punto (1,0);
	}
	
	public Vector (Punto origen, Punto extremo) {
		this.origen=origen;
		this.extremo=extremo;
	}
	
	//Métodos
	public double getOrientacion() {
		double h=((extremo.getX()/(Math.sqrt(Math.pow(extremo.getX(),2)+Math.pow(extremo.getY(),2)))));
		double angulo=Math.acos(h);
		return (angulo*180)/Math.PI;
	}
	
	public Punto getOrigen() {
		return origen;
	}
	public Punto getExtremo() {
		return extremo;
	}
	public double getModulo() {
		double distancia=origen.distancia(extremo);
		return distancia;
	}
	public Vector proyeccionX() {
		Punto x0=new Punto (origen.getX(),0);
		Punto x1=new Punto (extremo.getX(),0);
		Vector pX=new Vector (x0,x1);
		return pX;
		
	}
	public Vector proyeccionY() {
		Punto y0=new Punto (0,origen.getY());
		Punto y1=new Punto (0,extremo.getY());
		Vector pY=new Vector (y0,y1);
		return pY;
	}
	public Vector girar(double grados, double x0, double y0) {
		Punto p1=origen.girar(grados,x0,y0);
		Punto p2=extremo.girar(grados,x0,y0);
		Vector v1=new Vector (p1,p2);
		return v1;
	}
	public Vector girar(double grados) {
		Vector v1=new Vector (origen,extremo.girar(grados,origen.getX(),origen.getY()));
		return v1;
	}
	
	public Vector traslacion(double x0,double y0) {
		Punto p1=origen.traslacion(x0,y0);
		Punto p2=extremo.traslacion(x0,y0);
		return new Vector(p1,p2);
	}
	public String toString(){ 
		DecimalFormat form = new DecimalFormat(); 
		form.setMaximumFractionDigits(2);  
		return "[" + origen.toString() + ", " + form.format(getModulo()) + ", "+form.format(getOrientacion()) + "]"; 
	}
}
