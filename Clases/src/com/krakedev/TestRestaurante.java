package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
		rest1.nombre = "Sabores de Cuba";
		rest1.direccion = "Patria y Sierra Maestra";
		rest1.calificacion = 9.9;
		
		System.out.println("=========Restaurante 1=========");
		
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Dirección: " + rest1.direccion);
		System.out.println("Calificación: " + rest1.calificacion);
				
		
		Restaurante rest2 = new Restaurante();
		
		rest2.nombre = "Ceviches Manabitas";
		rest2.direccion = "Montecristi y Eloy Alfaro";
		rest2.calificacion = 10.0;
		
		System.out.println("=========Restaurante 2=========");
		
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Dirección: " + rest2.direccion);
		System.out.println("Calificación: " + rest2.calificacion);
		
	}

}
