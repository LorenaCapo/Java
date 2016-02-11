package cuentaCorriente;

public class MainCuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			CuentaCorriente cuenta = new CuentaCorriente();
			
			cuenta.setNombre("Anuka");
			cuenta.setApellidos("Riu Más");
			cuenta.setDireccion("Calle Sin Numero");
			cuenta.setTelefono("642.25.25.25");
			cuenta.setSaldo(550.25);
			cuenta.ingresarDinero(235.25);
			cuenta.retirarDinero(120.00);
			System.out.println("El saldo es " + cuenta.getSaldo());
			System.out.println("¿Estoy en números rojos?" + cuenta.getNumerosRojos());
		
	}

	

}
