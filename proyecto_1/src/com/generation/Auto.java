package com.generation;

public class Auto {
	
	private String modelo, color, chasis;
	private int year, nunPuertos, numMarchas, velocidadMaxima, velocidadActual, marchaActual, capacidadTanque;
	private boolean techoSolar, tieneTransmision;
	private Propietario propietario;
	private Marca marca;
	
	public Auto(String modelo, String color, String chasis, int year, int nunPuertos, int numMarchas,
			int velocidadMaxima, int velocidadActual, int marchaActual, int capacidadTanque, boolean techoSolar,
			boolean tieneTransmision, Propietario propietario, Marca marca) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.chasis = chasis;
		this.year = year;
		this.nunPuertos = nunPuertos;
		this.numMarchas = numMarchas;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
		this.marchaActual = marchaActual;
		this.capacidadTanque = capacidadTanque;
		this.techoSolar = techoSolar;
		this.tieneTransmision = tieneTransmision;
		this.propietario = propietario;
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNunPuertos() {
		return nunPuertos;
	}
	public void setNunPuertos(int nunPuertos) {
		this.nunPuertos = nunPuertos;
	}
	public int getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public int getMarchaActual() {
		return marchaActual;
	}
	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}
	public int getCapacidadTanque() {
		return capacidadTanque;
	}
	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}
	public boolean isTechoSolar() {
		return techoSolar;
	}
	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}
	public boolean isTieneTransmision() {
		return tieneTransmision;
	}
	public void setTieneTransmision(boolean tieneTransmision) {
		this.tieneTransmision = tieneTransmision;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", color=" + color + ", chasis=" + chasis + ", year=" + year + ", nunPuertos="
				+ nunPuertos + ", numMarchas=" + numMarchas + ", velocidadMaxima=" + velocidadMaxima
				+ ", velocidadActual=" + velocidadActual + ", marchaActual=" + marchaActual + ", capacidadTanque="
				+ capacidadTanque + ", techoSolar=" + techoSolar + ", tieneTransmision=" + tieneTransmision
				+ ", propietario=" + propietario + ", marca=" + marca + "]";
	}
	
}
