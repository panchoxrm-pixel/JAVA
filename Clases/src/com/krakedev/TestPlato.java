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
		
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: $ " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);
		
		System.out.println("==========Plato B==========");
		
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: $ " + platoB.precio);
		System.out.println("Disponible: " + platoB.disponible);
		
		System.out.println("==========Plato C==========");
		
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: $ " + platoC.precio);
		System.out.println("Disponible: " + platoC.disponible);		
						
	}

}
