package POOIX_Abs;

import javax.swing.JOptionPane;

public class Persistencia_Base_Datos extends Presistencia {
	@Override
	public void guardarDatos(String datos) {
		JOptionPane.showMessageDialog(null, "Guardando datos en la base de datos " + datos);
	}
	@Override
	public void cargarDatos() {
		JOptionPane.showMessageDialog(null, "Cargando datos en la base de datos");
	}
}
