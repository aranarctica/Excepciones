package AgenciaViajes;

public class Main {

	public static void main(String[] args) {
		
		Viajes epa = new Viajes();
		epa.setViajesDispo();
		Viajes koko = new Viajes();
		koko.setCapacidad(5);
		Viajes muu = new Viajes();
		muu.setTours(epa);
	}

}
