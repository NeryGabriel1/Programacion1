package POOX;

public class Use_Empleado {

	public static void main(String[] args) {
		// Usando el constructor que solo recibe el nombre
		Empleado Trabajador = new Empleado("Gael Sandobal");
		// Usando el constructor que recibe todos los atributos
		Empleado Trabajador2 = new Empleado("Claudia", 1500, "Casa");
		// Usando el constructor que recibe el nombre y el salario
		Empleado Trabajador3 = new Empleado("Cristiano Ronaldo", 3100);
		// Usando el constructor que recibe el nombre y el departamento
		Empleado Trabajador4 = new Empleado("Aurelio Casillas", "Venta");
		System.out.println(Trabajador);
		System.out.println(Trabajador2);
		System.out.println(Trabajador3);
		System.out.println(Trabajador4);

	}

}
