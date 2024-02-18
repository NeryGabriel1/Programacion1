package POOX;

import javax.swing.JOptionPane;

public class Use_Coche {

	public static void main(String[] args) {
		// Instanciamos un objeto coche usando el constructor vacio
		Coche auto1 = new Coche();
		JOptionPane.showMessageDialog(null, auto1);
		// Usando el contructor que recibe todos los atributos por parametro
		Coche auto2 = new Coche("For", "Mustang", 1989, "Verde");
		JOptionPane.showMessageDialog(null, auto2);
		// Usando el contructor que recibe los atributos marca, modelo, año y color por
		// defecto será Azul
		Coche auto3 = new Coche("Mercedes-Benz", "La poderosa", 2020);
		JOptionPane.showMessageDialog(null, auto3);
		// Usando el contructor que recibe los atributos marca y modelo.
		// El año igual a 2024 y el color igual a negro por defecto
		Coche auto4 = new Coche("Toyots", "fiesta");
		JOptionPane.showMessageDialog(null, auto4);
	}

}
