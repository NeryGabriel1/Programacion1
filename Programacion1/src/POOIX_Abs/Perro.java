package POOIX_Abs;

import javax.swing.JOptionPane;

public class Perro extends Animal {
	@Override
	public void hacer_Sonido(){
		JOptionPane.showMessageDialog(null, "El perro esta Labra, Labra");
	}
	@Override
	public void movimiento() {
		JOptionPane.showMessageDialog(null, "El perro esta Comiendo, Comiendo");
	}
}
