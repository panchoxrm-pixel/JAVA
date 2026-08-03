package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Lorena Arias");		
		e1.calificar(9);
		
		System.out.println("Estudiante: " + e1.nombre);
		System.out.println("Nota: " + e1.nota);
		System.out.println("Resultado: " + e1.resultado);
		
		Estudiante e2 = new Estudiante("Fernanda Salinas");		
		e2.calificar(7);
		
		System.out.println("Estudiante: " + e2.nombre);
		System.out.println("Nota: " + e2.nota);
		System.out.println("Resultado: " + e2.resultado);
		
		
	}

}
