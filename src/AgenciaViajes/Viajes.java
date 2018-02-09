package AgenciaViajes;

import java.util.Scanner;

/**
 * Creamos la clase y le damos los atributos
 * 
 * @author ik012982i9
 *
 */
public class Viajes {
	Scanner scan = new Scanner(System.in);

	private String hoteles = null;
	private int ocupacion;
	private int capacidad = 0;
	private float precios = 0;
	private String tours = null;
	private String clientes = null;
	private String destinos = null;
	private int viajesDispo = 0;
	private String[] paquetes = null;

	public Viajes() {

	}

	public Viajes(String destinos, int viajesDispo, String tours, float precios, int ocupacion) {
		this.destinos = destinos;
		this.viajesDispo = viajesDispo;
		this.tours = tours;
		this.ocupacion = ocupacion;
		this.precios = precios;

	}

	public String[] getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(String[] arraix) {

		this.paquetes = arraix;
	}

	public void setTours(String tours) {
		this.tours = tours;
	}

	public void setViajesDispo(int viajesDispo) {
		this.viajesDispo = viajesDispo;
	}

	public int getCapacidad() {

		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void porcentajeOcupacion() throws InterruptedException {
		double capacidadGlobal = -1;
		double gente = -1;
		int ocupacion = -1;
		ocupacion = this.getOcupacion();
		if (ocupacion != 0) {
			System.out.println("Introduce la gente que viene a la ciudad:");
			Scanner scan = new Scanner(System.in);
			gente = Integer.parseInt(scan.nextLine());
			capacidadGlobal = (ocupacion * 100) / gente;
			System.out.println(capacidadGlobal);
		} else {
			System.out.println("Debes insertar valor de ocupación: setOcupación");

		}

	}

	public int getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(int ocupacion) {
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

	public void setPrecios(float n) {

		this.setPrecios(n);
	}

	/**
	 * subimos los precios dependiendo de la cantidad de viajes diposnibles y de
	 * la ocupacion
	 * 
	 * @param precios
	 */
	public void setPreciosPaquete(float n) {

		if (viajesDispo <= 5) {
			this.precios = (precios * 100) / precios;
		}
		if (ocupacion > (ocupacion * 100) / 80) {
			this.precios = (precios * 100) / precios;
		}
		this.precios = precios;
	}

	public String getTours() {
		return tours;
	}

	/**
	 * Mostramos los tours disponibles
	 * 
	 * @param epa
	 */
	public void setTours(Viajes epa) {
		try {
			if (viajesDispo <= 0) {
				System.out.println("Estos son los tours disponibles:");
			}
			this.tours = tours;
		} catch (NumberFormatException e) {
			System.out.println("No puede hacer un numero negativo");
		}
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
	 * 
	 * @param destinos
	 */

	public void setDestinos(String destinos) {
	}

	public int getViajesDispo() {
		return viajesDispo;
	}

	/**
	 * Miramos si hay viajes disponibles
	 * 
	 * @param viajesDispo
	 */
	public void ViajesDispo() {
		System.out.println("Introduce la Cantidad de viajes que hay disponibles: ");
		int dispo;
		try {
			Scanner scan = new Scanner(System.in);
			dispo = Integer.parseInt(scan.nextLine());
			if (dispo == 0) {
				System.out.println("No hay viajes disponibles");
			} else {
				System.out.println("Los viajes disponibles son los siguientes: ");
			}
			this.viajesDispo = dispo;
		} catch (NumberFormatException e) {
			System.out.println("Error de formato, se esperaba un entero.");
		}

	}

	

}
