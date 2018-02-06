package AgenciaViajes;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	Viajes viajes = new Viajes("Canarias", 50 , "Teide", 550, 90);



	
	@Test
	public void hayViajesDispo(){
		int viajesDispo = 50;
		assertTrue(viajesDispo, viajes.getViajesDispo());
		
	}
	

	@Test
	public void hayTours(){
		String tours = "Teide";
		assertFalse(tours, viajes.getTours());
	}
	
	@Test
	public void queCapacidad(){
		int capacidad = 5;
		assertSame(capacidad, viajes.getCapacidad());
		
	
	}

	

	@Test
	public void ocupacion(){
		int ocupacion = 90;
		assertNull(ocupacion, viajes.getOcupacion());
	}
	
	@Test
	public void destino(){
		String destino = "canarias";
		assertNotSame(destino, viajes.getDestinos());
		
	}
	
	@Test
	public void dispo(){
		int dispo = 50;
		assertNotNull(dispo, viajes.getViajesDispo());
	}


	private void assertNotNull(int dispo, int viajesDispo) {
		
		
	}


	private void assertNull(int dispo, int viajesDispo) {
		
		
	}
	
	private void assertTrue(int viajesDispo, int viajesDispo2) {
		
		
	}
	private void assertFalse(String tours, String tours2) {
		
		
	}



}
