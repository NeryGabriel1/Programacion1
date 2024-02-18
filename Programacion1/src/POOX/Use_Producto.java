package POOX;

public class Use_Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciamos un objeto usando el constructor vacío
		Producto producto1 = new Producto();

		// primer constructor
		Producto producto2 = new Producto("Celular", 120.99, 5);

		// Constructor que solo recibe nombre y precio
		Producto producto3 = new Producto("Bandera", 14);

		System.out.println(producto1);
		System.out.println(producto2);
		System.out.println(producto3);
	}

}
