package com.generation;

public class EmpleadoTest {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado ("John", "Doe", 200.00);
		Empleado empleado2 = new Empleado ("Jane", "Doe", 230.00);
		
		System.out.println("Salario de " + empleado1.getName() +": " + empleado1.getSalario());
		System.out.println("Salario de " + empleado2.getName() +": " + empleado2.getSalario());
		
		System.out.println("\n--- Salario después de aumento ---");
		
		System.out.printf("Salario de " + empleado1.getName() +": %.2f", empleado1.getSalario()*1.1);
		System.out.printf("\nSalario de " + empleado2.getName() +": %.2f", empleado2.getSalario()*1.1);
		
		System.out.println("\n\nNúmero de empleados: " + Empleado.getNumberEmployees());

	}

}
