package POOIX_Abs;

import javax.swing.JOptionPane;

public class Persistencia_Archivo extends Presistencia {
	@Override
	public void guardarDatos(String archivo) {
		JOptionPane.showMessageDialog(null, "Guardando datos del archivo " + archivo);

	}
	@Override
	public void cargarDatos() {
		JOptionPane.showMessageDialog(null, "Cargando los datos de un archivo");

	}
}