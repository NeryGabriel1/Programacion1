package POOIX_Abs;

import javax.swing.JOptionPane;

public class Motocicleta extends Vehiculo {

	@Override
	public void acelerar(int velocidad) {
		JOptionPane.showMessageDialog(null, "La motocicleta está acelerando a la velocidad de " + velocidad + "km por hs"); 
	}

	@Override
	public void frenar(int velocidad) {
		JOptionPane.showMessageDialog(null, "La motocicleta está reduciendo su velocidad a " + velocidad + "km por hs"); 
	}
	
}