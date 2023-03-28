package vehiculos;
import java.util.*;
public class Pais {
	public static ArrayList<Pais> paises = new ArrayList<Pais>();
	public static ArrayList<String> paisOcurrencia = new ArrayList<String>();
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
		paisOcurrencia.add(nombre);
		
	}
	//Metodo paisMasVendedor
	public static Pais paisMasVendedor(){
		String paisMasFrecuente = Collections.max(paisOcurrencia, Comparator.comparingInt
				(o -> Collections.frequency(paisOcurrencia, o)));
		for(Pais country: paises) {
			if(country.getNombre().equals(paisMasFrecuente)) {
				return country;
			}
		}
		return null;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}