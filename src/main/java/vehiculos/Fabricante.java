package vehiculos;
import java.util.*;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public static ArrayList<Fabricante> fabricantesOriginal = new ArrayList<Fabricante>();
	public static ArrayList<String> fabricas = new ArrayList<String>();
	//Constructor Fabricante
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantesOriginal.add(this);
		fabricas.add(nombre);
	}
	
	//Metodo fabricaMayorVentas
	public static Fabricante fabricaMayorVentas() {
		String fabricaMasFrecuente = Collections.max(fabricas, Comparator.comparingInt
				(o -> Collections.frequency(fabricas, o)));
		for (Fabricante factory: fabricantesOriginal) {
			if (factory.getNombre().equals(fabricaMasFrecuente)) {
				return factory;
			}
		}
		return null;
	}
	// Metodos get y set de Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Metodos get y set pais
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}

