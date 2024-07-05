package com.generation;

import java.time.LocalDate;
import java.util.Date;

public class Propietario {
	
	private String nombre;
	private LocalDate nacimiento;
	private Direccion direccion;
	
	public Propietario(String nombre, LocalDate nacimiento, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", nacimiento=" + nacimiento + ", direccion=" + direccion + "]";
	}

}
