package com.generation;

import com.methods.Method;

public class Main {

	public static void main(String[] args) {
		
		IntegerSet conjunto1 = new IntegerSet();
		IntegerSet conjunto2 = new IntegerSet();
		IntegerSet conjunto3 = new IntegerSet();
		
		Method.insertElement(1, conjunto1);
		Method.insertElement(4, conjunto1);
		Method.insertElement(5, conjunto1);
		
		Method.insertElement(1, conjunto3);
		Method.insertElement(4, conjunto3);
		Method.insertElement(3, conjunto3);

		Method.deleteElement(5, conjunto1);
		
		System.out.println("Conjunto 1: " + Method.toSetString(conjunto1));
		System.out.println("Conjunto 1: " + Method.toSetString(conjunto2));
		
		System.out.println(Method.unionMat(conjunto1, conjunto3));
		System.out.println(Method.intersectionMat(conjunto1, conjunto3));
		
		Method.deleteElement(3, conjunto3);
		
		System.out.println("¿Los conjuntos son iguales? " + Method.equalTo(conjunto1, conjunto3));

	}

}
