package POOX;

import java.util.Random;

public class Empleado {
	private String nombre, departamento;
	private double salario;

	public Empleado(String nombre, double salario, String departamento) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
	}

	// Constructor que solo recibe el nombre
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.salario = 0;
		this.departamento = "Sin departamento";
	}

	// Constructor que solo recibe el nombre y salario
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = "RRHH";
	}

	// Constructor con nombre y departamento
	public Empleado(String nombre, String departamento) {
		this.nombre = nombre;
		this.departamento = departamento;
		Random rd = new Random();
		// Generamos salario random que está entre 1500 y 3500
		double salario = 1500 + (rd.nextDouble() * (3500 - 1500));
		salario = Math.round(salario * 100.0) / 100.0;
		this.salario = salario;
	}

	@Override
	public String toString() {
		StringBuilder resultados = new StringBuilder();
		resultados.append("Nombre: " + this.nombre + "\n");
		resultados.append("Salario: " + this.salario + "\n");
		resultados.append("Departamento: " + this.departamento + "\n");
		return resultados.toString();
	}
}
