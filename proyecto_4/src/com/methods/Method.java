package com.methods;

import com.generation.IntegerSet;

public class Method {
	
	public static void insertElement(int number, IntegerSet existentMatriz) {
        if (number >= 0 && number <= 100) {
            existentMatriz.getMatriz()[number] = true;
        } else {
            System.out.println("Recuerda que el número debe ser estar entre 0 y 100.");
        }
    }
	
	public static void deleteElement(int number, IntegerSet existentMatriz) {
        if (number >= 0 && number <= 100) {
            existentMatriz.getMatriz()[number] = false;
        } else {
            System.out.println("Recuerda que solo puede haber números entre 0 y 100. No se puede eliminar un número que no existe");
        }
    }
	
	public static String toSetString (IntegerSet existentMatriz) {
		boolean isEmpty = true;
        for (int i = 0; i < 101; i++) {
            if (existentMatriz.getMatriz()[i]) {
            	isEmpty = false;
            }
        }
        if (isEmpty) {
        	return ("matriz=[ - ]");
        } else {
        	return (existentMatriz.toString());
        }
	}
	
	public static IntegerSet unionMat (IntegerSet mat1, IntegerSet mat2) {
		IntegerSet newMatriz = new IntegerSet();
		for (int i = 0; i < newMatriz.getMatriz().length; i++) {
            newMatriz.getMatriz()[i] = mat1.getMatriz()[i] || mat2.getMatriz()[i];
        }
		return newMatriz;
	}
	
	public static IntegerSet intersectionMat (IntegerSet mat1, IntegerSet mat2) {
		IntegerSet newMatriz = new IntegerSet();
		for (int i = 0; i < newMatriz.getMatriz().length; i++) {
            newMatriz.getMatriz()[i] = mat1.getMatriz()[i] && mat2.getMatriz()[i];
        }
		return newMatriz;
	}
	
	public static boolean equalTo (IntegerSet mat1, IntegerSet mat2) {
		for (int i = 0; i < mat1.getMatriz().length; i++) {
			if (mat1.getMatriz()[i] != mat2.getMatriz()[i]) {
				return false;
			}
		}
		return true;
	}
}
