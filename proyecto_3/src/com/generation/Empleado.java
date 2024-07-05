package com.generation;

public class Empleado {
	String name, lastName;
	Double salario;

	// Variable de clase o variable estática para contar los empleados
	public static int numberEmployees = 0;

	public Empleado(String name, String lastName, Double salario) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.salario = salario;
		// Agregando el contador de numberEmployees
		numberEmployees++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	// get y set para numberEmployees
	public static int getNumberEmployees() {
		return numberEmployees;
	}

	public static void setNumberEmployees(int numberEmployees) {
		Empleado.numberEmployees = numberEmployees;
	}

}
