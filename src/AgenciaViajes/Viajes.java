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

	private String hoteles;
	private int ocupacion;
	private int capacidad;
	private float precios;
	private String tours;
	private String clientes;
	private String destinos;
	private int viajesDispo;
	private String[] paquetes;

	public Viajes() {

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
		System.out.println("Introduce la gente que viene a la ciudad:");
		Integer gente;
		Integer ocupacion = null;
		try {
			Scanner scan = new Scanner(System.in);
			gente = Integer.parseInt(scan.nextLine());
			capacidad = ocupacion / gente;
		} catch (NullPointerException e) {
			System.err.println("Se esperaba un numero que no fuese 0");
		}

	}

	public int getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(int ocupacion) {

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
	 * subimos los precios dependiendo de la cantidad de viajes diposnibles y de
	 * la ocupacion
	 * 
	 * @param precios
	 */
	public void setPrecios(float precios) {

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
				System.out.println("Estos son los tours disponibles");
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
	 * 
	 * @param viajesDispo
	 */
	public void setViajesDispo() {
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
	

	public void setPaquetes(Viajes arraix) {
		try {
			String[] paquete = new String[8];
			System.out.println("Introduce la cantidad de elementos del paquete");
			String res = scan.nextLine();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("La cantidad introducida es superior a la capacidad del paquete");

		}
	}

}
