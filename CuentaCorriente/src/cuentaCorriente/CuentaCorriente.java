package cuentaCorriente;

public class CuentaCorriente {
	
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private Double saldo;
	private Boolean numerosRojos = false;
	
	public CuentaCorriente(){
		
	}
	
	public CuentaCorriente(String nombre, String apellidos, String direccion, String telefono, Double saldo,
			Boolean numerosRojos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.saldo = saldo;
		this.numerosRojos = numerosRojos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Boolean getNumerosRojos() {
		return this.numerosRojos;
	}

	public void setNumerosRojos(Boolean numerosRojos) {
		this.numerosRojos = numerosRojos;
	}
	
	
	void retirarDinero(Double cantidad){
		this.saldo = this.saldo - cantidad;
	}
	
	void ingresarDinero(Double cantidad){
		this.saldo = this.saldo + cantidad;
	}
	
	void consultarCuenta(){
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Apellidos: " + this.getApellidos());
		System.out.println("Dirección: " + this.getDireccion());
		System.out.println("Teléfono: " + this.getTelefono());
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	boolean saldoNegativo(){
		return this.numerosRojos;
	}
}
