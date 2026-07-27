package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
		rest1.setNombre("Sabores de Cuba");
		rest1.setDireccion("Patria y Sierra Maestra");
		rest1.setCalificacion(9.9);
		
		System.out.println("=========Restaurante 1=========");
		
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion());
				
		
		Restaurante rest2 = new Restaurante();
		
		rest2.setNombre("Ceviches Manabitas");
		rest2.setDireccion("Montecristi y Eloy Alfaro");
		rest2.setCalificacion(10.0);
		
		System.out.println("=========Restaurante 2=========");
		
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());
		
	}

}
