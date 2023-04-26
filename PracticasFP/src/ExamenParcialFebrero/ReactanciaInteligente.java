package examenParcialFebrero;

public class ReactanciaInteligente implements IReactancia {
	private IReactancia reactancia;

	public void setReactancia(int a, double valor) {
		if (a==0) {
			reactancia=new ReactanciaInductiva(valor);
		} else {
			reactancia=new ReactanciaCapacitiva(valor);
		}	
	}
	
	public double getReactancia() {
		return reactancia.getReactancia();
	}
	public void setFrecuencia(double frecuencia) {
		reactancia.setFrecuencia(frecuencia);
	}
	
	public String toString() {
		return reactancia.toString();
	}
	
	public static void main(String[]args) {
		ReactanciaInteligente a=new ReactanciaInteligente();
		ReactanciaInteligente b=new ReactanciaInteligente();
		
		a.setReactancia(0, 0.6);
		a.setFrecuencia(60);
		b.setReactancia(1, 7);
		b.setFrecuencia(60);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}
