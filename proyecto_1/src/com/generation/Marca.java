package com.generation;

public class Marca {
	
	private String nombre;
	private int numModelos, yearLanzamiento, codigoIdentificador;
	
	public Marca(String nombre, int numModelos, int yearLanzamiento, int codigoIdentificador) {
		super();
		this.nombre = nombre;
		this.numModelos = numModelos;
		this.yearLanzamiento = yearLanzamiento;
		this.codigoIdentificador = codigoIdentificador;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumModelos() {
		return numModelos;
	}
	public void setNumModelos(int numModelos) {
		this.numModelos = numModelos;
	}
	public int getYearLanzamiento() {
		return yearLanzamiento;
	}
	public void setYearLanzamiento(int yearLanzamiento) {
		this.yearLanzamiento = yearLanzamiento;
	}
	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}
	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	
	@Override
	public String toString() {
		return "Marca [nombre=" + nombre + ", numModelos=" + numModelos + ", yearLanzamiento=" + yearLanzamiento
				+ ", codigoIdentificador=" + codigoIdentificador + "]";
	}
	
}
