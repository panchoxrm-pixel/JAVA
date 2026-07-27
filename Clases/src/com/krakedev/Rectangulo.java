package com.krakedev;

public class Rectangulo {

	private int base;
	private int altura;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calcularArea() {
		int resultadoArea = base * altura;
		return resultadoArea;
	}
		
	public int calcularPerimetro() {
		int resultadoPerimetro = (base * 2) + (altura * 2);
		return resultadoPerimetro;
	}
	
}
