package examenParcialFebrero;

public class ReactanciaInductiva implements IReactancia {
	
	//variables de instancia
	private double inductancia;
	private double frecuencia;
	//constructores
	public ReactanciaInductiva(double inductancia) {
		this.inductancia=inductancia;
		frecuencia=1;
	}
	
	//métodos
	public double getReactancia() {
		return (2*Math.PI*frecuencia*inductancia);
	}
	
	public void setFrecuencia(double frecuencia) {
		this.frecuencia=frecuencia;
	}
	
	public String toString (double inductancia, double frecuencia) {
		return ("Reactancia Inductiva XL= "+getReactancia()+" Ohmios");
	}
	
}
