package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
			double s1 = c1.sumar(4, 2);
			
			System.out.println("Resultado de la suma: " + s1);
			
			int r1 = c1.restar(8, 6);
			
			System.out.println("Resultado de la resta: " + r1);
			
			double m1 = c1.multiplicar(10, 5);
			
			System.out.println("Resultado de la multiplicación: " + m1);
			
			double d1 = c1.dividir(10, 2);
			
			System.out.println("Resultado de la división: " + d1);
			
			double p1 = c1.promediar(10, 8, 9);
			
			System.out.println("Resultado del promedio: " + p1);
			
	}

}
