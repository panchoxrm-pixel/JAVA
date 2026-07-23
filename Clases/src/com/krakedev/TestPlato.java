package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		
		platoA.nombre = "Moros y Cristianos";
		platoA.tipo = "Plato fuerte";
		platoA.precio = 6.50;
		platoA.disponible = true;		
			
		Plato platoB = new Plato();
		
		platoB.nombre = "Ceviche Jipijapa";
		platoB.tipo = "Plato fuerte";
		platoB.precio = 9.50;
		platoB.disponible = true;
		
		Plato platoC = new Plato();
		
		platoC.nombre = "Natilla Manaba";
		platoC.tipo = "Postre";
		platoC.precio = 3.50;
		platoC.disponible = true;
		
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
