package POOIX_Abs;

public class Use_Persistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instanciar
		Presistencia archivo = new Persistencia_Archivo();

		archivo.guardarDatos(" De paco");
		archivo.cargarDatos();

		Presistencia archivo1 = new Persistencia_Base_Datos();
		archivo1.guardarDatos("De X ");
		archivo1.cargarDatos();

	}

}
