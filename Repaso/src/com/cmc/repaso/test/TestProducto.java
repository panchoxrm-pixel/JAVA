package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		System.out.println("=============Producto 1=============");
		
		Producto p1 = new Producto("cuaderno", 5);		
		double precioPromo1 = p1.calcularPrecioPromo(20);
				
		System.out.println("Precio de promoción: $ " + precioPromo1);
		
		System.out.println("=============Producto 2=============");
		
		Producto p2 = new Producto("estuchera", 3);
		p2.setPrecio(2);
		double precioPromo2 = p2.calcularPrecioPromo(10);
				
		System.out.println("Precio de promoción: $ " + precioPromo2);
		
		System.out.println("=============Producto 3=============");
		
		Producto p3 = new Producto("mochila", -25);		
		double precioPromo3 = p3.calcularPrecioPromo(30);
				
		System.out.println("Precio de promoción: $ " + precioPromo3);		
		
	}

}
