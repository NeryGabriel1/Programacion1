package POOIX_Abs;

public class Empleado_Tiempo_Completo extends Empleado {
	
	private double salario;
	
	public Empleado_Tiempo_Completo(double salario) {
		this.salario=salario;
	}
	@Override
	 public double Calcular_Salario() {
		return salario;
		
	}

}
