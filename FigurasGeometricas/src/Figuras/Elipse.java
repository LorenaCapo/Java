package Figuras;
import java.lang.Math;

public class Elipse extends Figura {
	public double radioMayor;
	public double radioMenor;
	
	public Elipse(){
		
	}

	public Elipse(double radioMayor, double radioMenor){
		super("Elipse");
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	public double getRadioMayor() {
		return this.radioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public double getRadioMenor() {
		return this.radioMenor;
	}

	public void setRadioMenor(double radioMenor) {
		this.radioMenor = radioMenor;
	}
	
	@Override
	public double calcularArea(){
		return Math.PI * this.radioMayor * this.radioMenor;
	}
}
