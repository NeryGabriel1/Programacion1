package POOIX_Abs;

public class Use_Vehiculos {

	public static void main(String[] args) {
		// Instanciamos el objeto automovil
		Automovil coche = new Automovil();
		coche.acelerar(130);
		coche.frenar(100);
		// Instanciamos el objeto motocicleta
		Motocicleta moto = new Motocicleta();
		moto.acelerar(190);
		moto.frenar(120);

	}

}
