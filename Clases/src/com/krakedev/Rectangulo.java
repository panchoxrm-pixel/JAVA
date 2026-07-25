package com.krakedev;

public class Rectangulo {

	public int base;
	public int altura;
	
	public int calcularArea() {
		int resultadoArea = base * altura;
		return resultadoArea;
	}
		
	public int calcularPerimetro() {
		int resultadoPerimetro = (base * 2) + (altura * 2);
		return resultadoPerimetro;
	}
	
}
