package com.krakedev;

public class Calculadora {
	
	public double sumar(int a, int b) {
		double resultado = a + b;
		return resultado;
	}
	
	public int restar(int a, int b) {
		int resultado = a - b;
		return resultado;
	}
	
	public double multiplicar(double valor1, double valor2) {
		double resultado = valor1 * valor2;
		return resultado;
	}
	
	public double dividir(double valor1, double valor2) {
		double resultado = valor1 / valor2;
		return resultado;
	}
	
	public double promediar(double valor1, double valor2, double valor3) {
		double promedio = (valor1 + valor2 + valor3)/3;
		return promedio;
	}
		
}
