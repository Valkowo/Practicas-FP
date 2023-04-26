package examenParcialFebrero;

public class ReactanciaCapacitiva implements IReactancia{
private double frecuencia, capacidad;
public ReactanciaCapacitiva(double capacidad){
this.capacidad=capacidad;
frecuencia=1;
}
public double getReactancia(){
return 1/(2*Math.PI*frecuencia*capacidad);
}
public void setFrecuencia(double frecuencia){
this.frecuencia=frecuencia;
}
public String toString(){
return "Reactancia Capacitiva XC =" + getReactancia() + " Ohmios";
}
}
