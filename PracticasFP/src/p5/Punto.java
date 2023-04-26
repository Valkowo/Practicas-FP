package p51;
import java.text.DecimalFormat;
public class Punto implements IForma {

	//variables de instancia
	private double x;
	private double y;
	
	//constructores
	public Punto() {
		x=0;
		y=0;
	}
	public Punto(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	//operaciones
	public double getOrientacion() {
		return 0;
	}
	public Punto girar(double grados,double x0,double y0) {
		double rad=(grados*(Math.PI))/180;
		double x1=x0+(x-x0)*Math.cos(rad)-(y-y0)*Math.sin(rad);
		double y1=y0+(x-x0)*Math.sin(rad)+(y-y0)*Math.cos(rad);
		
		return new Punto(x1,y1);
	}
	public Punto girar(double grados) {
		return new Punto(x,y);
	}
	public Punto traslacion(double x0, double y0) {
		double x1=x+x0;
		double y1=y+y0;
		
		return new Punto(x1,y1);
	}
	public double distancia(Punto p) {
		return (Math.sqrt(Math.pow(p.getX()-x,2)+Math.pow(p.getY()-y,2)));
	}
	public String toString() {
		DecimalFormat form=new DecimalFormat();
		form.setMaximumFractionDigits(2);
		
		return "["+form.format(x)+","+form.format(y)+"]";
	}
}
