package AgenciaViajes;

public class Main {

	public static void main(String[] args) {
		
		Viajes europa = new Viajes();
		europa.setOcupacion(5);
		try {
			europa.porcentajeOcupacion();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.err.println("jjfgh");
		}catch (NumberFormatException e) {
			System.err.println("Se esperaba un numero entero");
		}
		
		
		Viajes gozada = new Viajes();
		gozada.ViajesDispo();
	
		
		
		
	
		
		
		
	}

}
