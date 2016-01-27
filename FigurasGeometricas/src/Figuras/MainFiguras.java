package Figuras;
import java.util.ArrayList;

public class MainFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		
		Circulo circulo = new Circulo(3);
		Rectangulo rectangulo = new Rectangulo(2,3);
		Cuadrado cuadrado = new Cuadrado(2);
		Elipse elipse = new Elipse(2,4);
		
		listaFiguras.add(circulo);
		listaFiguras.add(rectangulo);
		listaFiguras.add(cuadrado);
		listaFiguras.add(elipse);
		
		for (Figura elemento : listaFiguras){
			System.out.println(elemento.getNombre() + " area = " + elemento.calcularArea());
		}
	}

/*	public static void testSetGet(){
		Circulo circle = new Circulo();
		circle.setRadio(3);

		if (circle.getRadio() == 3 ){
			System.out.print("Ok test set get");
		}else{
			System.out.print("Fail test set get");
		}
		
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setLongitud(3);
		rectangulo.setAmplitud(2);
	}
	*/
	
}
