package com.generation;

public class Direccion {
	
	private String calle, barrio, ciudad;

	public Direccion(String calle, String barrio, String ciudad) {
		super();
		this.calle = calle;
		this.barrio = barrio;
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", barrio=" + barrio + ", ciudad=" + ciudad + "]";
	}
	
}
