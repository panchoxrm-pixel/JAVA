package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		
//		platoA.nombre = "Moros y Cristianos";
//		platoA.tipo = "Plato fuerte";
//		platoA.precio = 6.50;
//		platoA.disponible = true;		
		
		platoA.setNombre("Moros y Cristianos");
		platoA.setTipo("Plato fuerte");
		platoA.setPrecio(6.50);
		platoA.setDisponible(true);
		
		Plato platoB = new Plato();
		
//		platoB.nombre = "Ceviche Jipijapa";
//		platoB.tipo = "Plato fuerte";
//		platoB.precio = 9.50;
//		platoB.disponible = true;
		
		platoB.setNombre("Ceviche Jipijapa");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(9.50);
		platoB.setDisponible(true);
		
		Plato platoC = new Plato();
		
//		platoC.nombre = "Natilla Manaba";
//		platoC.tipo = "Postre";
//		platoC.precio = 3.50;
//		platoC.disponible = true;
		
		platoC.setNombre("Natilla Manaba");
		platoC.setTipo("Postre");
		platoC.setPrecio(3.50);
		platoC.setDisponible(true);
		
		System.out.println("==========Plato A==========");
		
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: $ " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.isDisponible());
		
		System.out.println("==========Plato B==========");
		
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: $ " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.isDisponible());
		
		System.out.println("==========Plato C==========");
		
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: $ " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.isDisponible());		
						
	}

}
