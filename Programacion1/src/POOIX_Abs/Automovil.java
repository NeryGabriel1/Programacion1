package POOIX_Abs;

import javax.swing.JOptionPane;

public class Automovil extends Vehiculo{

	@Override
	public void acelerar(int velocidad) {
		JOptionPane.showMessageDialog(null, "El automovil está acelerando a una velocidad de" + velocidad + " km por horas");
	}

	@Override
	public void frenar(int velocidad) {
		JOptionPane.showMessageDialog(null, "El automovil está reduciendo su velocidad a " + velocidad + "km por horas");
	}
	
}