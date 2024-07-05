package com.methods;

import com.generation.Factura;

public class Methods {

	public Double getTotalFactura (Factura factura) {
		return factura.getAmountArticle()*factura.getPriceArticle();
	}
}
