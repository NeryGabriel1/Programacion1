package POOX;

import javax.swing.JOptionPane;

public class Use_Estudiante {

	public static void main(String[] args) {

		// Instanciamos un objeto estudiante usando el contructor
		// que recibe todos los atributos por parametro
		Estudiante alumno1 = new Estudiante("Salvador Cabañas", 19, 9.8);
		JOptionPane.showMessageDialog(null, alumno1);
		// Usando el constructor que solo recibe el nombre y la edad
		Estudiante alumno2 = new Estudiante("Pablo Zeballos", 16);
		JOptionPane.showMessageDialog(null, alumno2);
		// Usando el contructor que solo recibe el nombre
		Estudiante alumno3 = new Estudiante("Nelson Haedo");
		JOptionPane.showMessageDialog(null, alumno3);

	}

}
