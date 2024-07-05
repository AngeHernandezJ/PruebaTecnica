package com.methods;

import com.generation.Auto;

public class Method {
	
	public static void aceleracion (Auto auto) {
		if (auto.getVelocidadActual() < auto.getVelocidadMaxima()) {
			auto.setVelocidadActual(auto.getVelocidadActual()+1);
		}
	}
	
	public static void frenado (Auto auto) {
		auto.setVelocidadActual(0);
	}
	
	public static void aumentaMarcha (Auto auto) {
		// Se añadió un atributo para registrar la marcha actual
		if (auto.getMarchaActual() < auto.getNumMarchas() && auto.getMarchaActual() >= 0) {
			auto.setMarchaActual(auto.getMarchaActual()+1);
		}
	}
	
	public static void reduceMarcha (Auto auto) {
		if (auto.getMarchaActual() > 0 && auto.getVelocidadActual() > 0) {
			auto.setMarchaActual(auto.getMarchaActual()-1);
		}
	}
	
	public static String calcularAutonomia (Auto auto, double distanciaRecorrida, double nivelTanque) {
		return ("La autonomía de su auto es: " + (auto.getCapacidadTanque() - nivelTanque) / distanciaRecorrida + "%");
	}
	
	public static String volumenCombustible (Auto auto, double nivelCombustible) {
		return ("El volumen de combustible de su tanque es: " + ((nivelCombustible) * 100) / auto.getCapacidadTanque() + "%");
	}

}
