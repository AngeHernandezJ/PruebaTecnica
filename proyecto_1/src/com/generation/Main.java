package com.generation;

import java.time.LocalDate;

import com.methods.Method;

public class Main {

	public static void main(String[] args) {
		
		Marca marca1 = new Marca("Toyota", 20, 1937, 123);
		Direccion direccion1 = new Direccion("Av. de los Plateros", "Vicente Guerrero", "Taxco");
		Propietario propietario1 = new Propietario("John", LocalDate.of(2002, 01, 01), direccion1);
		Auto auto1 = new Auto("Camry", "blanco", "CHS123456", 2020, 4, 4, 56, 12, 0, 50, false, true, propietario1, marca1);
		
		
		System.out.println(auto1);
		System.out.println(propietario1);
		
		Method.aceleracion(auto1);
		System.out.println(auto1);
		
		Method.frenado(auto1);
		System.out.println(auto1);
		
		Method.aumentaMarcha(auto1);
		System.out.println(auto1);
		
		Method.reduceMarcha(auto1);
		System.out.println(auto1);
		
		/* Para calcular la autonomía, el usuario deberá indicar la distancia recorrida en km
		 * y el nivel actual de combustible en litrosts (suponiendo que cuando comenzó el recorrido 
		 * el tanque estaba lleno)*/
		System.out.println(Method.calcularAutonomia(auto1, 3, 48));
		
		/* Para mostrar el volumen de combustible, el usuario debe indicar el nivel actual (en litros)
		 * de combustible */
		System.out.println(Method.volumenCombustible(auto1, 42));

	}

}//Method.aceleracion((int) auto1.getActualVel())
