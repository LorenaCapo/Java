package Figuras;

public class Cuadrado extends Figura {
	public double lado;
	
	public Cuadrado(){
		
	}
	
	public Cuadrado(double lado){
		super("Cuadrado");
		this.lado = lado;
	}

	public double getLado() {
		return this.lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea(){
		return this.lado * this.lado;
	}

}
