package POOIX_Abs;

import javax.swing.JOptionPane;

public class Gato extends Animal{

	public void hacer_Sonido() {
		JOptionPane.showMessageDialog(null, "El Gato esta gritando , Raulllllll, Raullllll");
	}

	@Override
	public void movimiento() {
		JOptionPane.showMessageDialog(null, "El Gato esta Caminando, Caminando");
	}
}