package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		
		System.out.println("=============Rectángulo 1=============");
		
		Rectangulo r1 = new Rectangulo();
		
		r1.setBase(7);
		r1.setAltura(11);
		
		int resultadoArea = r1.calcularArea();
		
		int resultadoPerimetro = r1.calcularPerimetro();
		
		System.out.println("Área: " + resultadoArea);
		
		System.out.println("Perímetro: " + resultadoPerimetro);
		
		System.out.println("=============Rectángulo 2=============");
		
		Rectangulo r2 = new Rectangulo();
		
		r2.setBase(12);
		r2.setAltura(4);
		
		int resultadoArea2 = r2.calcularArea();
		
		int resultadoPerimetro2 = r2.calcularPerimetro();
						
		System.out.println("Área: " + resultadoArea2);
		
		System.out.println("Perímetro: " + resultadoPerimetro2);

	}

}
