package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(5666, "arroz");
		producto1.setDescripcion("kg");
		producto1.setPeso(2);
		
		System.out.println("Código: " + producto1.getCodigo());
		System.out.println("Nombre " + producto1.getNombre());
		System.out.println("Descripción: " + producto1.getDescripcion());
		System.out.println("Peso: " + producto1.getPeso());

	}

}
