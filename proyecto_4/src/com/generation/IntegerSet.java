package com.generation;

import java.util.Arrays;

public class IntegerSet {

	private boolean[] matriz;

	public IntegerSet() {
		matriz = new boolean[101];
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = false;
		}
	}

	public boolean[] getMatriz() {
		return matriz;
	}

	public void setMatriz(boolean[] matriz) {
		this.matriz = matriz;
	}

	@Override
	public String toString() {
		return "matriz=" + Arrays.toString(matriz);
	}

}
