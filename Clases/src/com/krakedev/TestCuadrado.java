package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		System.out.println("==============Cuadrado 1==============");		
		Cuadrado c1 = new Cuadrado();		
		c1.lado = 5;		
		double resultadoArea1 = c1.calcularArea();		
		double resultadoPerimetro1 = c1.calcularPerimetro();
		System.out.println("Área: " + resultadoArea1);
		System.out.println("Perímetro: " + resultadoPerimetro1);
		
		System.out.println("==============Cuadrado 2==============");
		Cuadrado c2 = new Cuadrado();		
		c2.lado = 7;		
		double resultadoArea2 = c2.calcularArea();		
		double resultadoPerimetro2 = c2.calcularPerimetro();
		System.out.println("Área: " + resultadoArea2);
		System.out.println("Perímetro: " + resultadoPerimetro2);
		
		System.out.println("==============Cuadrado 3==============");
		Cuadrado c3 = new Cuadrado();		
		c3.lado = 18;		
		double resultadoArea3 = c3.calcularArea();		
		double resultadoPerimetro3 = c3.calcularPerimetro();
		System.out.println("Área: " + resultadoArea3);
		System.out.println("Perímetro: " + resultadoPerimetro3);
	}

}
