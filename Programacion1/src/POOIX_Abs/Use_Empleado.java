package POOIX_Abs;

import javax.swing.JOptionPane;

public class Use_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado_Tiempo_Completo Jesse = new Empleado_Tiempo_Completo(1200);
		Empleado_Tiempo_Parcial Jop = new Empleado_Tiempo_Parcial(33.00 , 9.00);

		JOptionPane.showMessageDialog(null, "El salario del empleado es: " + Jesse.Calcular_Salario() + "€");
		JOptionPane.showMessageDialog(null, "El salario del empleado es: " + Jop.Calcular_Salario() + "€");
	}

}
