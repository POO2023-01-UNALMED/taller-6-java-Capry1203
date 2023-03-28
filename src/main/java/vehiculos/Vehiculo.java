package vehiculos;

public class Vehiculo {
	private String placa;
	private String nombre;
	private String traccion;
	private Fabricante fabricante;
	private int puertas;
	private int velocidadMaxima;
	private int precio;
	private int peso;
	private static int CantidadVehiculos = 0;
	protected static int CantidadAutomovil = 0;
	protected static int CantidadCamion = 0;
	protected static int CantidadCamioneta = 0;
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.setCantidadVehiculos(Vehiculo.getCantidadVehiculos() + 1);

	}
	
	//metodo que muestra cada vehiculo por tipo
	
	public static String vehiculosPorTipo(){
		return "Automoviles:" + CantidadAutomovil + "\n" +
				"Camionetas" + CantidadCamioneta + "\n" +
				"Camiones" + CantidadCamion;
	}
	// Metodos get y set Placa

	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	// Metodos get y set velocidad Maxima 
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	// Metodos get y set Nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Metodos get y set Traccion
	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	// Metodos get y set Fabricante 
	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	// Metodos get y set Precio
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//Metodos get y set Peso
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	// Metodos get y set Cantidad Vehiculos
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	

}
