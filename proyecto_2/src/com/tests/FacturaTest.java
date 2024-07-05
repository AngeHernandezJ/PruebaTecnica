package com.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.Factura;
import com.methods.Methods;

class FacturaTest {
	
	Factura factura1 = new Factura("01", "Teclado", 5, 209.99);
	Factura factura4 = new Factura("04", "Bocina Bluetooth", 1, -83.25);
	
	Methods totalFactura = new Methods();

	@Test
	void test1() {
		assertEquals(1049.95, totalFactura.getTotalFactura(factura1));
	}
	
	@Test
	void test2() {
		assertEquals(0.0, totalFactura.getTotalFactura(factura4));
	}

}
