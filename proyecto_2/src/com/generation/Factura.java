package com.generation;

public class Factura {
	String number, description;
	int amountArticle;
	Double priceArticle;
	
	public Factura(String number, String description, int amountArticle, Double priceArticle) {
		super();
		this.number = number;
		this.description = description;
		//this.amountArticle = amountArticle;
		//this.priceArticle = priceArticle;
		setAmountArticle(amountArticle);
		setPriceArticle(priceArticle);
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmountArticle() {
		return amountArticle;
	}
	public void setAmountArticle(int amountArticle) {
		if (amountArticle > 0) {
			this.amountArticle = amountArticle;
		} else {
			this.amountArticle = 0;
		}
	}
	public Double getPriceArticle() {
		return priceArticle;
	}
	public void setPriceArticle(Double priceArticle) {
		if (priceArticle > 0) {
			this.priceArticle = priceArticle;
		} else {
			this.priceArticle = 0.0;
		}
	}
	
	
}
