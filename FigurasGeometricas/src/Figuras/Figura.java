package Figuras;

public abstract class Figura {
	String nombre = null;

	public Figura(){
		
	}
	
	public Figura(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double calcularArea();
	
}