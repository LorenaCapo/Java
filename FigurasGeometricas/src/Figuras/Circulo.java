package Figuras;
import java.lang.Math;

public class Circulo extends Figura{
	public double radio;
	
	public Circulo(){
		
	}
	
	public Circulo(double radio){
		super("Circulo");
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea(){
		return Math.PI * this.radio * this.radio;
	}
	
}
