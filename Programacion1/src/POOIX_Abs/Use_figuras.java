package POOIX_Abs;

import javax.swing.JOptionPane;

public class Use_figuras {

	public static void main(String[] args) {
		FigurasGeo[] figura = new FigurasGeo[2];

		figura[0] = new Circulo(9);
		figura[1] = new Rectangulo(2, 4);
		JOptionPane.showMessageDialog(null, "El área del circulo es de " + figura[0].calcularArea());
		JOptionPane.showMessageDialog(null, "El área del rectangulo es de " + figura[1].calcularArea());

	}

}



