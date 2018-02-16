package AgenciaViajes;

public class Main {

	public static void main(String[] args) {

		Viajes europa = new Viajes();
		europa.setOcupacion(5);
		
		
		
		try {
			Comunicacion comunicar = new Comunicacion();
			europa.porcentajeOcupacion();
		} catch (InterruptedException e) {
			e.printStackTrace();
	
		} catch (NumberFormatException e) {
			System.err.println("Se esperaba un numero entero");
		}

	

	}

}
