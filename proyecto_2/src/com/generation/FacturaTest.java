package com.generation;

import com.methods.Methods;

//import com.generation;

public class FacturaTest {

	public static void main(String[] args) {
		Factura factura1 = new Factura("01", "Teclado", 5, 209.99);
		Factura factura2 = new Factura("02", "Mouse", 2, 107.96);
		Factura factura3 = new Factura("03", "Bocina USB", -1, 83.25);
		Factura factura4 = new Factura("04", "Bocina Bluetooth", 1, -83.25);
		
		Methods totalFactura = new Methods();

		System.out.println("Factura 1:");
		System.out.println("Número: " + factura1.getNumber());
		System.out.println("Descripción: " + factura1.getDescription());
		System.out.println("Cantidad comprada: " + factura1.getAmountArticle());
		System.out.println("Precio por artículo: " + factura1.getPriceArticle());
		System.out.println("Total: " + totalFactura.getTotalFactura(factura1));
		System.out.println("---------------------");
		
		System.out.println("Factura 2:");
		System.out.println("Número: " + factura2.getNumber());
		System.out.println("Descripción: " + factura2.getDescription());
		System.out.println("Cantidad comprada: " + factura2.getAmountArticle());
		System.out.println("Precio por artículo: " + factura2.getPriceArticle());
		System.out.println("Total: " + totalFactura.getTotalFactura(factura2));
		System.out.println("---------------------");
		
		System.out.println("Factura 3:");
		System.out.println("Número: " + factura3.getNumber());
		System.out.println("Descripción: " + factura3.getDescription());
		System.out.println("Cantidad comprada: " + factura3.getAmountArticle());
		System.out.println("Precio por artículo: " + factura3.getPriceArticle());
		System.out.println("Total: " + totalFactura.getTotalFactura(factura3));
		System.out.println("---------------------");
		
		System.out.println("Factura 4:");
		System.out.println("Número: " + factura4.getNumber());
		System.out.println("Descripción: " + factura4.getDescription());
		System.out.println("Cantidad comprada: " + factura4.getAmountArticle());
		System.out.println("Precio por artículo: " + factura4.getPriceArticle());
		System.out.println("Total: " + totalFactura.getTotalFactura(factura4));

	}

}
