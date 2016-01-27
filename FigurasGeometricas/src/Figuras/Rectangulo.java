package Figuras;

public class Rectangulo extends Figura {
	public double amplitud;
	public double longitud;
	
	public Rectangulo(){
		
	}
	
	public Rectangulo(double amplitud, double longitud){
		super("Rectangulo");
		this.amplitud = amplitud;
		this.longitud = longitud;
	}

	public double getAmplitud() {
		return this.amplitud;
	}

	public void setAmplitud(double amplitud) {
		this.amplitud = amplitud;
	}

	public double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	@Override
	public double calcularArea(){
		return this.longitud * this.amplitud;
	}
}
