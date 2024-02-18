package POOIX_Abs;

public class Empleado_Tiempo_Parcial extends Empleado {
	private double hora;
	private double tarifa;

	public Empleado_Tiempo_Parcial(double hora, double tarifa) {
		this.hora = hora;
		this.tarifa = tarifa;
	}

	@Override
	public double Calcular_Salario() {
		return hora * tarifa;
	}

}
