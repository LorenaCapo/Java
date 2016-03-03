package distancias;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDistanciasTest {
	double pies, metros, pulgadas, cm;

	@Test
	public void testConversorPiesToMetros() {
		pies = 1;
		metros = ConversorDistancias.conversorPiesToMetros(pies);
		assertEquals(metros, 0.3048, 0.001);	
	}
	
	@Test
	public void testConversorMetrosToPies() {
		metros = 1;
		pies = ConversorDistancias.conversorMetrosToPies(metros);
		assertEquals(pies, 3.2808, 0.001);
	}

	@Test
	public void testConversorPiesToPulgadas() {
		pies = 1;
		pulgadas = ConversorDistancias.conversorPiesToPulgadas(pies);
		assertEquals(pulgadas, 12, 0.001);
	}	
	
	@Test
	public void testConversorPulgadasToPies() {
		pulgadas = 12;
		pies = ConversorDistancias.conversorPulgadasToPies(pulgadas);
		assertEquals(pies, 1, 0.001);
	}
	
	@Test
	public void testConversorCmToPies() {
		cm = 10;
		pies = ConversorDistancias.conversorCmToPies(cm);
		assertEquals(pies, 0.3281, 0.001);
	}
	
	@Test
	public void testConversorPiesToCm() {
		pies = 1;
		cm = ConversorDistancias.conversorPiesToCm(pies);
		assertEquals(cm, 30.48,0.001);
	}
	
	@Test
	public void testConversorCmToPulgadas() {
		cm = 10;
		pulgadas = ConversorDistancias.conversorCmToPulgadas(cm);
		assertEquals(pulgadas, 3.9371, 0.001);
	}
	
	@Test
	public void testConversorPulgadasToCm() {
		pulgadas = 10;
		cm = ConversorDistancias.conversorPulgadasToCm(pulgadas);
		assertEquals(cm, 25.4, 0.001);
	}
}
