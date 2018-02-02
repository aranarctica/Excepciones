package AgenciaViajes;
/**
 * Creamos la clase y le damos los atributos
 * @author ik012982i9
 *
 */
public class Viajes {

	private String hoteles;
	private int ocupacion;
	private int capacidad;
	private float precios;
	private String tours;
	private String clientes;
	private String destinos;
	private int viajesDispo;

	
	public void Viajes() {

	}

	public Viajes(String destinos, int viajesDispo, String tours, float precios, int ocupacion) {
		this.destinos = destinos;
		this.viajesDispo = viajesDispo;
		this.tours = tours;
		this.ocupacion = ocupacion;
		this.precios = precios;

	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getOcupacion() {
		return ocupacion;
	}
	/**
	 * Miramos si la capacidad de la ocupacion es inferior al 20%
	 * @param ocupacion
	 */

	public void setOcupacion(int ocupacion) {
		if(ocupacion <= (capacidad*100)/20);
		
		this.ocupacion = ocupacion;
	}

	public String getHoteles() {

		return hoteles;
	}

	public void setHoteles(String hoteles) {
		this.hoteles = hoteles;
	}

	public float getPrecios() {
		return precios;
	}

	
	/**
	 * subimos los precios dependiendo de la cantidad de viajes diposnibles y de la ocupacion
	 * @param precios
	 */
	public void setPrecios(float precios) {
		
		
		
		if (viajesDispo <= 5) {
			this.precios = (precios * 100) / precios;
		}
		if(ocupacion > (ocupacion*100)/80){
			this.precios = (precios*100) / precios;
		}
		this.precios = precios;
	}

	public String getTours() {
		return tours;
	}

	
	/**
	 * Mostramos los tours disponibles
	 * @param tours
	 */
	public void setTours(String tours) {
		if (viajesDispo <= 0) {
			System.out.println("Estos son los tours disponibles");
		}
		this.tours = tours;
	}

	public String getClientes() {
		return clientes;
	}

	public void setClientes(String clientes) {
		this.clientes = clientes;
	}

	public String getDestinos() {
		return destinos;
	}
	/**
	 * Mostramos los destinos
	 * @param destinos
	 */

	public void setDestinos(String destinos) {
		if (viajesDispo <= 0) {
			System.out.println("Los destinos posibles son los siguientes:");
		}
		this.destinos = destinos;
	}

	public int getViajesDispo() {
		return viajesDispo;
	}

	/**
	 * Miramos si hay viajes disponibles
	 * @param viajesDispo
	 */
	public void setViajesDispo(int viajesDispo) {
		System.out.println("Introduce la Cantidad de viajes que hay disponibles: ");
		if (viajesDispo <= 0) {
			System.out.println("No hay viajes disponibles");
		} else {
			System.out.println("Los viajes disponibles son los siguientes: ");
		}
		this.viajesDispo = viajesDispo;
	}

}
